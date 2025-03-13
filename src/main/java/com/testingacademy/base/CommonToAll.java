package com.testingacademy.base;

import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.testingacademy.driver.DriverManager.getDriver;
//import static com.testingacademy.driver.DriverManagerTL.getDriver;

public class CommonToAll {

    public CommonToAll(){

        //If you want to call something before every Page Object Class call, put your code here
        //Open file, Open Data Base Connection you can write code here
    }

    //This is common to all pages

    public void openVWOLoginURL(){
        getDriver().get(PropertyReader.readkey("url"));

    }

    public void clickElement(By by){
        getDriver().findElement(by).click();

    }

    public void enterInput(By by, String key){
        getDriver().findElement(by).sendKeys(key);
    }

    //Wait Explicits here

    public WebElement presenceOfElement(By elementLocation){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }


    public WebElement visibilityOfElement(By elementLocation){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }


    public WebElement getElement(By key){
        return getDriver().findElement(key);
    }



}
