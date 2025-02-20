package com.testingacademy.pages.pageFactory;

import com.testingacademy.base.CommonToAll;
import com.testingacademy.pages.pageObjectModel.DashboardPage_POM;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF extends CommonToAll {

    WebDriver driver;

    //Constructor
    public LoginPage_PF(){
        super();
        PageFactory.initElements(driver, this);
    }

    //Page Locators
    @FindBy (id = "login-username")
            private WebElement username;

    @FindBy(id = "login-password")
        private WebElement password;

    @FindBy(id = "js-login-btn")
            private WebElement signinButton;

    @FindBy(className = "notification-box-description")
        private WebElement error_message;



    //Page Actions
/*public String loginToVWOInvalidCred() {
    enterInput(username, PropertyReader.readkey("valid_username"));
    enterInput(password, "admin");
    clickElement(signinButton);
    presenceOfElement(error_message);
    visibilityOfElement(error_message);
    return getElement(error_message).getText();


}*/

/*    public void loginToVWOValidCred() {
        enterInput(username, PropertyReader.readkey("valid_username"));
        enterInput(password, PropertyReader.readkey("valid_password"));
        clickElement(signinButton);
        //By using valid credential we will get Dashboard page
    }*/

    public DashboardPage_POM afterLoginVWOValidCred(){

    return new DashboardPage_POM();


    }

}
