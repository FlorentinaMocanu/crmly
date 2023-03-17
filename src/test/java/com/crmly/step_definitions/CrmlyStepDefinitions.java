package com.crmly.step_definitions;

import com.crmly.pages.CrmlyMessagePage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrmlyStepDefinitions {

  CrmlyMessagePage crmlyMessagePage=new CrmlyMessagePage();

  @Given("user is login page")
  public void user_is_login_page() {

    Driver.getDriver().get("https://qa.crmly.net/");

  }


  @Given("user enter valid username,password")
  public void user_enter_valid_username_password() {

  }
  @Given("user click login button")
  public void user_click_login_button() {

  }
  @When("user is on home page")
  public void user_is_on_home_page() {

  }

    @Then("click on message button")
    public void click_on_message_button() {

    }
    @When("user enters text in message fields")
    public void user_enters_text_in_message_fields() {

    }
    @When("user add a recipient")
    public void user_add_a_recipient() {

    }
    @Then("User sent message")
    public void user_sent_message() {

    }

}
