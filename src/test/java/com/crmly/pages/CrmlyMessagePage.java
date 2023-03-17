package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CrmlyMessagePage {

    public CrmlyMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
