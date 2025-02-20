package com.testingacademy.pages.pageObjectModel;

import com.testingacademy.base.CommonToAll;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM extends CommonToAll {

    WebDriver driver;

    //Constructor
    public LoginPage_POM(){
        super();
    }

    //Page Locators
private By username = By.id("login-username");
private By password = By.id("login-password");
private By signinButton = By.id("js-login-btn");
private By errorMessage = By.className("notification-box-description");



    //Page Actions
public String loginToVWOInvalidCred() {
    enterInput(username, PropertyReader.readkey("valid_username"));
    enterInput(password, "admin");
    clickElement(signinButton);
    presenceOfElement(errorMessage);
    visibilityOfElement(errorMessage);
    return getElement(errorMessage).getText();


}

    public void loginToVWOValidCred() {
        enterInput(username, PropertyReader.readkey("valid_username"));
        enterInput(password, PropertyReader.readkey("valid_password"));
        clickElement(signinButton);
        //By using valid credential we will get Dashboard page
    }

    public DashboardPage_POM afterLoginVWOValidCred(){

    return new DashboardPage_POM();


    }

}
