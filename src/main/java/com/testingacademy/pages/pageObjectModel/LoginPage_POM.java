package com.testingacademy.pages.pageObjectModel;

import com.testingacademy.base.CommonToAll;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_POM extends CommonToAll {

    WebDriver driver;

    //Constructor
    public LoginPage_POM(){
        super();
    }

    //Page Locators
By username = By.id("login-username");
By password = By.id("login-password");
By signinButton = By.id("js-login-btn");
By error_message = By.className("notification-box-description");



    //Page Actions
public String loginToVWOInvalidCred() {
    enterInput(username, PropertyReader.readkey("valid_username"));
    enterInput(password, "admin");
    clickElement(signinButton);
    presenceOfElement(error_message);
    visibilityOfElement(error_message);
    return getElement(error_message).getText();


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
