package calculator;

import java.util.*;


public class CalculatorImpl implements Calculator {
    private final List<Integer> numbers = new LinkedList<>();
    private final InputCheck checkNonBinaryOps = size -> size != 2;

    @Override
    public void enter(int i) throws IllegalStateException {
        numbers.add(i);
        InputCheck check = size -> size > 2;
        if (check.on(numbers.size())){
            throw new IllegalStateException();
        }
    }

    @Override
    public void add() throws IllegalStateException {
        if (checkNonBinaryOps.on(numbers.size())){
            throw new IllegalStateException();
        }
        numbers.set(0, numbers.get(0) + numbers.get(1));
        numbers.remove(1);
    }

    @Override
    public void subtract() throws IllegalStateException {
        if (checkNonBinaryOps.on(numbers.size())){
            throw new IllegalStateException();
        }
        numbers.set(0, numbers.get(0) - numbers.get(1));
        numbers.remove(1);
    }

    @Override
    public void multiply() throws IllegalStateException {
        if (checkNonBinaryOps.on(numbers.size())){
            throw new IllegalStateException();
        }
        numbers.set(0, numbers.get(0) * numbers.get(1));
        numbers.remove(1);
    }

    @Override
    public int getResult() throws IllegalStateException {
        InputCheck check = size -> size != 1;
        if (check.on(numbers.size())) {
            throw new IllegalStateException();
        }
        return numbers.getFirst();
    }
}
