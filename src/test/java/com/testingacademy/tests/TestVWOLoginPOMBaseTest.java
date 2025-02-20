package com.testingacademy.tests;

import com.testingacademy.baseTest.CommonToAllTest;
import com.testingacademy.pages.pageObjectModel.DashboardPage_POM;
import com.testingacademy.pages.pageObjectModel.LoginPage_POM;
import com.testingacademy.utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.assertj.core.api.Assertions.*;

public class TestVWOLoginPOMBaseTest extends CommonToAllTest {

    @Test (groups = {"smoke"}, priority = 1)
    public void testLoginNegative() {
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String error_msgText = loginPagePom.loginToVWOInvalidCred();
        Assert.assertEquals(error_msgText, "Your email, password, IP address or location did not match");
        Assertions.assertThat(error_msgText)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readkey("error_message"));
    }

    @Test (priority = 2)
    public void testLoginPositive() {
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        loginPagePom.loginToVWOValidCred();
        DashboardPage_POM dashboardPagePom = loginPagePom.afterLoginVWOValidCred();
        String usernameLoggedIn = dashboardPagePom.loggedInUserName();
        //TestNG assertion
        Assert.assertEquals(usernameLoggedIn, PropertyReader.readkey("expected_username"));
        //Assert J
        Assertions.assertThat(usernameLoggedIn)
                .isNotNull()
                .isNotEmpty()
                .contains(PropertyReader.readkey("expected_username"));


    }
}
