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

    @Given("^I pass single number value$")
    public void I_pass_single_number_value(){
        this.value = "5";
    }

    @When("^I trigger calculate function$")
    public void I_trigger_calculate_function(){
        this.result = calculator.add(value);
    }

    @Then("^I get 5 as a result$")
    public void I_get_5_as_a_result(){
        Assert.assertEquals(5, result);
    }

    @And("^I pass null value$")
    public void i_Pass_Null_Value() {
        this.value = null;
    }

    @Then("^I get 0 as a result$")
    public void i_Get_0_As_A_Result(){
        Assert.assertEquals(0, result);
    }

    @And("^I pass blank value$")
    public void i_Pass_Blank_Value(){
        this.value = "";
    }

    @And("^I pass numbers 3 and 5$")
    public void i_Pass_Numbers_3_And_5() {
        this.value = "3;5";
    }

    @Then("^I get 8 as a result$")
    public void i_Get_8_As_A_Result() {
        Assert.assertEquals(8, result);
    }

    @And("^I pass numbers 1 2 3 and 4$")
    public void i_Pass_Numbers_1_2_3_And_4(){
        this.value = "1;2;3;4";
    }

    @Then("^I get 10 as a result$")
    public void i_Get_10_As_A_Result() {
        Assert.assertEquals(10, result);
    }

    @And("^I pass 1 2 3 4 with whitespaces$")
    public void i_Pass_With_Whitespaces() {
        this.value = "1; 2; 3; 4";
    }
}
