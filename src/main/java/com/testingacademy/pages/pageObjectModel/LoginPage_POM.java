package com.testingacademy.pages.pageObjectModel;

import com.testingacademy.base.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_POM extends CommonToAll {

    WebDriver driver;
    public LoginPage_POM(){
        super();
    }
    //Page Locators
By username = By.id("login-username");
By password = By.id("login-password");
By signinButton = By.id("js-login-btn");
By error_message = By.className("notification-box-description");



    //Page Actions
public String loginToVWONegative() {
    enterInput(username, "admin@admin.com");
    enterInput(password,"admin");
    clickElement(signinButton);
    try {
        Thread.sleep(5000);
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return getElement(error_message).getText();


}

}
