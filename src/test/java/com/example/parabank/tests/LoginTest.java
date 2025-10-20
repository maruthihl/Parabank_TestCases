package com.example.parabank.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.parabank.base.BaseTest;
import com.example.parabank.pages.LoginPage;
import com.example.parabank.utils.ConfigReader;

public class LoginTest {

    private LoginPage login;

    @BeforeMethod
    public void setUp() {
        BaseTest.initializeBrowser();
        login = new LoginPage(BaseTest.getDriver());
    }

    @Test
    public void testValidLogin() {
        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");

        login.login(username, password);

        String expectedTitle = "Swag Labs";
        String actualTitle = BaseTest.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "❌ Login failed or title mismatch");
    }

    @AfterMethod
    public void tearDown() {
        BaseTest.tearDown();
    }
}
