package com.testingacademy.tests;

import com.testingacademy.pages.pageObjectModel.LoginPage_POM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLoginPOMBaseTest {

    @Test
    public void testLoginNegative() {
        LoginPage_POM loginPagePom = new LoginPage_POM();
        String error_msgText = loginPagePom.loginToVWONegative();
        Assert.assertEquals(error_msgText, "Your email, password, IP address or location did not match");


    }
}
