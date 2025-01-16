package calculator;

import java.util.*;

public class CalculatorImpl implements Calculator {
    private final List<Integer> numbers = new LinkedList<>();

    @Override
    public void enter(int i) throws IllegalStateException {
        numbers.add(i);
        if (numbers.size() > 2){
            throw new IllegalStateException();
        }
    }

    @Override
    public void add() throws IllegalStateException{
        if (numbers.size() != 2){
            throw new IllegalStateException();
        }
        numbers.set(0, numbers.get(0) + numbers.get(1));
        numbers.remove(1);
    }

    @Override
    public int getResult() throws IllegalStateException {
        if (numbers.size() != 1){
            throw new IllegalStateException();
        }
        return numbers.getFirst();
    }
}
