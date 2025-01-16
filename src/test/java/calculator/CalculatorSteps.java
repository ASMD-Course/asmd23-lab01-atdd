package calculator;

import io.cucumber.java.en.*;

public class CalculatorSteps {
    private int res = 0;
    private CalculatorImpl calculator;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new CalculatorImpl();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        this.calculator.add();
        if (arg0 != this.calculator.getResult()) {
            throw new IllegalStateException();
        }
    }

    @Then("the multiplication should be {int}")
    public void theMultiplicationShouldBe(Integer arg0) {
        this.calculator.multiply();
        if (arg0 != this.calculator.getResult()) {
            throw new IllegalStateException();
        }
    }

    @Then("the subtraction should be {int}")
    public void theSubtractionShouldBe(Integer arg0) {
        this.calculator.subtract();
        if (arg0 != this.calculator.getResult()) {
            throw new IllegalStateException();
        }
    }
}
