package Logintest;

import PageObjects.LoginPageObjects;
import AppiumController.AppiumSetup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class logintest extends AppiumSetup {

    @Test
    public void test1()
    {
        System.out.print("this is test one");
        android.util.Log.d(TAG, "test1() called");
    }

    @Test
    public void test2(){
        LoginPageObjects loginpage = new LoginPageObjects(driver);
        loginpage.email.sendKeys("sharad");
        loginpage.password.sendKeys("12345");
        loginpage.loginButton.click();
        Assert.assertEquals("Authentication Sucessful", "Authentication Sucessful" );

    }

    }
