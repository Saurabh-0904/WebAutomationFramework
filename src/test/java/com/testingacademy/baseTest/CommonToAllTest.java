package com.testingacademy.baseTest;

import com.testingacademy.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {

    //To call or to start the WebDriver
    //Down the WebDriver

    //Who will Start the WebDriver?

    //Start the WebDriver
    @BeforeMethod
    public void setup(){
        DriverManager.init();
    }


    //Close the WebDriver
    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }

}
