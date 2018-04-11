package com.sda.bank;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BankSteps {

    private BankUser user;
    private Bank bank;
    private boolean userInsertResult;

    @Given("^I instantiate bank database$")
    public void iInstantiateBankDatabase(){
        this.bank = new Bank();
    }

    @When("^I add bank user to bank$")
    public void i_Add_Bank_User_To_Bank() {
        userInsertResult = bank.addBankUser(user);
    }

    @Then("^I have user in bank$")
    public void iHaveUserInBank() {
        Assert.assertTrue(userInsertResult);
        Assert.assertEquals(1, bank.numberOfUsers());
    }

    @And("^I create user with name '(.*)' and pesel '(.*)'$")
    public void iCreateUserWithNameAndPesel(String name, String pesel) {
        this.user = new BankUser(name,pesel);
    }
}
