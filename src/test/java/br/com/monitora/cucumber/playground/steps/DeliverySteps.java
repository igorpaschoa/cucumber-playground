package br.com.monitora.cucumber.playground.steps;

import br.com.monitora.cucumber.playground.utils.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DeliverySteps {
    private Date delivery;

    @Given("^the delivery is on (.*)$")
    public void theDeliveryIsOn(@Transform(DateConverter.class) Date date) throws Throwable {
        delivery = date;
        System.out.println(delivery);
    }

    @When("^the delivery is (\\d+) (day|days|month|months) late$")
    public void theDeliveryIsDaysLate(int dayOrMonth, String time) throws Throwable {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(delivery);

        if (time.equals("day") || time.equals("days")) {
            calendar.add(Calendar.DAY_OF_MONTH, dayOrMonth);
        }

        if (time.equals("month") || time.equals("months")) {
            calendar.add(Calendar.MONTH, dayOrMonth);
        }

        delivery = calendar.getTime();
    }

    @Then("^the delivery will be on (.*)$")
    public void theDeliveryWillBeOn(@Transform(DateConverter.class) Date date) throws Throwable {
        Assert.assertEquals(date, delivery);
    }
}
