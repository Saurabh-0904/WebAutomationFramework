package com.testingacademy.pages.pageObjectModel;

import com.testingacademy.base.CommonToAll;
import org.openqa.selenium.By;

public class DashboardPage_POM extends CommonToAll {

    public DashboardPage_POM(){


    }


    //Page Locators
    By usernameOnDashboard = By.xpath("//span[@class='Fw(semi-bold) ng-binding']");

    //Page Actions
    public String loggedInUserName(){
        presenceOfElement(usernameOnDashboard);
        return getElement(usernameOnDashboard).getText();

    }
}
