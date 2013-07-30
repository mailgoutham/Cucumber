package com.goutham.calculator;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

/**
 * User: Goutham Rathnaswamy
 * Date: 30/07/2013
 * Time: 13:36
 */
public class CalculatorSteps {

    private CalculatorService calculatorService;

    @Given("^the calculator is initialized to zero$")
    public void the_calculator_is_initialized_to_zero() {
        calculatorService = new CalculatorService();
        calculatorService.initialize();
        Assert.assertThat(calculatorService.getResult(), is(0));
    }

    @When("^(\\d+) is added with (\\d+)$")
    public void is_added_with(int arg1, int arg2) {
        calculatorService.add(arg1, arg2);
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int arg1) {
        Assert.assertThat(calculatorService.getResult(),is(arg1));
    }

}
