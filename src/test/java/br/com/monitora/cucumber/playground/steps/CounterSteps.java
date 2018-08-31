package br.com.monitora.cucumber.playground.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CounterSteps {
    private int counter = 0;

    @Given("^the counter value is (\\d+)$")
    public void theCounterValueIs(int counter) throws Throwable {
        this.counter = counter;
    }

    @When("^add (\\d+)$")
    public void add(int value) throws Throwable {
        this.counter = this.counter + value;
    }

    @Then("^counter equals (\\d+)$")
    public void counterEquals(int value) throws Throwable {
        Assert.assertEquals(value, this.counter);
    }
}
