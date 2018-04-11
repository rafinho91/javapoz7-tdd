package com.sda.service.bookstore;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BookstoreSteps {

    private Bookstore bookstore;
    private Book book;
    private String title;

    @Given("^I initialize bookstore$")
    public void i_Initialize_Bookstore() {
        this.bookstore = new Bookstore();
    }

    @Given("^I create new book$")
    public void I_create_new_book(){
        this.book = new Book("Harry Potter",523,
                            "JRR Rowling","ABC234");
    }

    @When("^I add book to the bookstore$")
    public void i_Add_Book_To_The_Bookstore(){
        this.bookstore.add(this.book);
    }

    @Then("^I have book in my bookstore$")
    public void i_Have_Book_In_My_Bookstore() {
        Assert.assertEquals(1, this.bookstore.getBooks().size());
    }

    @And("^I change a book title$")
    public void i_Change_A_Book_Title(){
        this.bookstore.updateTitle(book,"Krzyzacy");
    }

    @Then("^Book's title has changed$")
    public void bookS_Title_Has_Changed() {
        Assert.assertEquals("Krzyzacy", this.bookstore.getBooks().get(0).getTitle());
    }
}
