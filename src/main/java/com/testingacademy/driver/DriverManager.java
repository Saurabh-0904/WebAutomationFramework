package com.testingacademy.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver (){
        return driver;
    }


    public static void init(){
        if (driver == null){
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
    }


    public static void down(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
