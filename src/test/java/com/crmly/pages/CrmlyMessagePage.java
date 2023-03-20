package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmlyMessagePage {

    public CrmlyMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  @FindBy(name = "USER_LOGIN")
    public WebElement usernameBox;


    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordBox;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-message\"]/span")
    public WebElement messageButton;

    @FindBy(xpath = "/html/body")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@id=\"bx-destination-tag\"]")
    public WebElement addMoreButton;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement addMoreBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployees;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement deleteAllEmployee;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")
    public WebElement errorRecipient;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")
    public WebElement errorMessageTitle;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement addrecipient;

  @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span[2]/span[2]")
  public WebElement deleteNewRecipient;

  @FindBy(xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-link']")
  public WebElement cancelBuuton;

  @FindBy(xpath = "//*[@id=\"feed-add-post-destination-input\"]")
  public WebElement addSecondRecipient;

  @FindBy(xpath = "//*[@class='bx-finder-box-item-t7-name']")
  public WebElement clickRecipient;

  @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span[3]/span[2]")
  public WebElement deleteSecondRecipient;
}
