package com.selenium.tests;

import com.selenium.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import com.selenium.tests.LoginPage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit; 

public class NextentTelekom extends DriverBase {

    @Test
    public void telekomPutMtid() throws Exception {
        WebDriver driver = getDriver();
        driver.get("https://www.telekom.hu/telekomfiok/belepes?5");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        setText(LoginPage.INPUT_FIELD_LOGON_ID, "06707730089").validateText(LoginPage.INPUT_FIELD_LOGON_ID, "06707730089");
//        setText(LoginPage.INPUT_FIELD_PASSWORD, "50904").validateText(LoginPage.INPUT_FIELD_PASSWORD, "50904");

        
        
//        click(LoginPage.INPUT_BUTTON_LOGIN); 
    	
    }


	
}
