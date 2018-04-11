package com.sda.service.cucumber;

import com.sda.service.StringCalculator;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StringCalculatorSteps {

    private String value;
    private int result;
    private StringCalculator calculator = new StringCalculator();

    @Given("^I initialize stringCalculator$")
    public void i_initialize_stringCalculator(){
        this.calculator = new StringCalculator();
    }

    @Given("^I pass (.*) value$")
    public void I_pass_single_number_value(String text){
        this.value = text;
    }

    @And("^I pass value null$")
    public void i_Pass_Null_Value() {
        this.value = null;
    }

    @Then("^I get (.*) as a result$")
    public void I_get_5_as_a_result(int passedResult){
        Assert.assertEquals(passedResult, result);
    }

    @When("^I trigger calculate function$")
    public void I_trigger_calculate_function(){
        this.result = calculator.add(value);
    }

}
