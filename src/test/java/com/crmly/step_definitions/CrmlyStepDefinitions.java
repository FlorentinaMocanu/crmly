package com.crmly.step_definitions;

import com.crmly.pages.CrmlyMessagePage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CrmlyStepDefinitions {

  CrmlyMessagePage crmlyMessagePage=new CrmlyMessagePage();


  @Given("user is login page")
  public void user_is_login_page() {

    Driver.getDriver().get("https://qa.crmly.net/");

  }


  @Given("user enter valid username,password")
  public void user_enter_valid_username_password() {
    crmlyMessagePage.usernameBox.sendKeys("hr1@cybertekschool.com");
    crmlyMessagePage.passwordBox.sendKeys("UserUser");

  }

  @When("user click login button go to home page")
  public void user_click_login_button_go_to_home_page() {
    crmlyMessagePage.loginButton.click();
  }

    @Then("click on message button")
    public void click_on_message_button() throws InterruptedException {
     crmlyMessagePage.messageButton.click();


    }
    @When("user enters text in message fields")
    public void user_enters_text_in_message_fields() {
    Driver.getDriver().switchTo().frame(0);
    crmlyMessagePage.messageBox.sendKeys("I want automate this functionality");
      Driver.getDriver().switchTo().parentFrame();
    }
    @When("user add a recipient")
    public void user_add_a_recipient() throws InterruptedException {
    crmlyMessagePage.addMoreButton.click();
    crmlyMessagePage.addMoreBox.sendKeys("helpdesk2@cybertekschool.com");
    crmlyMessagePage.addrecipient.click();

    }
    @Then("User sent message")
    public void user_sent_message() {
    crmlyMessagePage.sendButton.click();

    }
    


  @Given("user see All employees is default")
  public void userSeeAllEmployeesIsDefault() {
  Assert.assertTrue(crmlyMessagePage.allEmployees.getText().equals("All employees"));
  }

  @And("user can delete All employees from recipients")
  public void userCanDeleteAllEmployeesFromRecipients() {
    crmlyMessagePage.deleteAllEmployee.click();
  }

  @Then("user see error message for recipient field")
  public void userSeeErrorMessageForRecipientField() {
    Assert.assertTrue(crmlyMessagePage.errorRecipient.getText().equals("Please specify at least one person."));
  }

  @Then("user see error message for message title")
  public void userSeeErrorMessageForMessageTitle() {
    Assert.assertTrue(crmlyMessagePage.errorMessageTitle.getText().equals("The message title is not specified"));
  }

  @Then("user delete added recipient")
  public void userDeleteAddedRecipient() {
    crmlyMessagePage.deleteNewRecipient.click();

  }


  @Then("user cancel send message")
  public void userCancelSendMessage() {
    crmlyMessagePage.cancelBuuton.click();
  }


  @And("user add second recipient")
  public void userAddSecondRecipient() throws InterruptedException {
    crmlyMessagePage.addSecondRecipient.sendKeys("helpdesk4@cybertekschool.com");
    crmlyMessagePage.clickRecipient.click();

  }

  @When("user delete second recipient")
  public void userDeleteSecondRecipient() {
    crmlyMessagePage.deleteSecondRecipient.click();
  }
}
