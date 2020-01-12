package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {

@Before("@Smoke1")
public void login(){
    System.out.println("Before");
}

    @Given("^Launch the application in chrome browser$")
    public void launch_the_application_in_chrome_browser() {
        System.out.println("launch the application in chrome browser");

    }

    @When("Enter the \"([^\"]*)\" and \"([^\"]*)\"")
    public void enter_the_and(String string, String string2) {
        System.out.println("Enter Credentials");

    }

    @Then("^Click on the Login button$")
    public void click_on_the_Login_button() {
        System.out.println("Click on login button");

    }


}

