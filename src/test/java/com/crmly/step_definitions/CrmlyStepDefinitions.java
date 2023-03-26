package com.crmly.step_definitions;

import com.crmly.pages.CrmlyMessagePage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CrmlyStepDefinitions {

  CrmlyMessagePage crmlyMessagePage = new CrmlyMessagePage();


  @Given("User logs in")
  public void userLogsIn(){
    crmlyMessagePage.login();

  /*  String url= ConfigurationReader.getProperty("url.crmly");
    Driver.getDriver().get(url);
    crmlyMessagePage.usernameBox.sendKeys("hr1@cybertekschool.com");
     crmlyMessagePage.passwordBox.sendKeys("UserUser");
     crmlyMessagePage.loginButton.click();
*/
  }

  @When("user click on message button")
  public void userClickOnMessageButton() {
    crmlyMessagePage.messageButton.click();
  }

  @And("user type {string} in message fields")
  public void userTypeInMessageFields(String string) {
    Driver.getDriver().switchTo().frame(0);
    crmlyMessagePage.messageBox.sendKeys(string);
    Driver.getDriver().switchTo().parentFrame();
  }


  @Given("user see All employees by default")
  public void userSeeAllEmployeesByDefault() {
    Assert.assertTrue(crmlyMessagePage.allEmployeeText.getText().equals("All employees"));
  }

  @And("user can delete All employees from recipients")
  public void userCanDeleteAllEmployeesFromRecipients() {

    crmlyMessagePage.deleteAllEmployee.click();
  }

  @And("User click send message button")
  public void userClickSendMessageButton() {
    crmlyMessagePage.sendButton.click();
  }

  @Then("user see error message {string}")
  public void userSeeErrorMessage(String string) {

    Assert.assertTrue(crmlyMessagePage.errorRecipient.isDisplayed());
  }

  @When("user click sent message button without title")
  public void userClickSentMessageButtonWithoutTitle() {

    crmlyMessagePage.sendButton.click();
  }


  @Then("user delete added recipients")
  public void userDeleteAddedRecipients() {
    crmlyMessagePage.deleteSecondRecipient.click();
    crmlyMessagePage.deleteNewRecipient.click();

   }


  @Then("user cancel send message")
  public void userCancelSendMessage() {
    crmlyMessagePage.cancelBuuton.click();
  }

  @Then("user sees error message {string}")
  public void userSeesErrorMessage(String string) {
    Assert.assertTrue(crmlyMessagePage.errorMessageTitle.isDisplayed());
  }

  @And("user add new recipient {string}")
  public void userAddNewRecipient(String string) {
    crmlyMessagePage.addMoreButton.click();
    crmlyMessagePage.addMoreBox.sendKeys(string);
    crmlyMessagePage.addrecipient.click();
  }

  @And("user add second recipient {string}")
  public void userAddSecondRecipient(String string) {
    crmlyMessagePage.addSecondRecipient.sendKeys(string);
    crmlyMessagePage.clickRecipient.click();

  }


}