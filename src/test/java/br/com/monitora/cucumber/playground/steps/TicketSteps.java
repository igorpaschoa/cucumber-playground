package br.com.monitora.cucumber.playground.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.math.BigDecimal;

public class TicketSteps {
    @Given("^the( special)? ticket is (A.\\d{3}+)$")
    public void theTicketIsAF(String type, String ticketNumber) throws Throwable {
    }

    @Given("^the passage value is \\$ (.*)$")
    public void thePassageValueIs$(BigDecimal value) throws Throwable {
        System.out.println(value);
    }

    @Given("^the passenger name is \"(.{5,20})\"$")
    public void thePassengersNameIs(String name) throws Throwable {
    }

    @Given("^the passenger phone is (9\\d{3}-\\d{4})$")
    public void thePassengerSPhoneIs(String phone) throws Throwable {
    }

    @When("^all the steps are created$")
    public void allTheStepsAreCreated() throws Throwable {
    }

    @Then("^the test will work$")
    public void theTestWillWork() throws Throwable {
    }
}
