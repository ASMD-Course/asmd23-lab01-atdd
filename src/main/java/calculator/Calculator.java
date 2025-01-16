package calculator;

public interface Calculator {

    /**
     * Enter a number in the stack
     * @param i the number to enter
     * @throws IllegalStateException if user tries to enter more than 2 number
     */
    void enter(int i) throws IllegalStateException;

    /**
     * Add the first two entries of the stack
     * @throws IllegalStateException if the operation is performed with less than two numbers
     */
    void add() throws IllegalStateException;

    /**
     * Return the result of the previous operation
     * @return the integer result of the previous operation
     * @throws IllegalStateException if a result isn't available
     */
    int getResult() throws IllegalStateException;
}
