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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger; 

import com.selenium.tests.LoginPage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit; 

public class NextentTelekomIT extends DriverBase {

	//http://www.jtechlog.hu/artifacts/log4j.pdf
	
    protected Logger logger = LogManager.getLogger(getClass()); 
    
    @Test
    public void telekomPutMtid() throws Exception {
        WebDriver driver = getDriver();
        driver.get("https://www.telekom.hu/telekomfiok/belepes");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Before: " + driver.getTitle());
        
        System.out.println(driver.getCurrentUrl());
        
        WebElement get_id = driver.findElement(By.id("tf-logonIdX")); 
        get_id.clear();
        get_id.sendKeys("067077300");
        
        WebElement get_pass = driver.findElement(By.id("tf-password1")); 
        get_pass.clear();
        get_pass.sendKeys("50904");
        
        WebElement logged_in = driver.findElement(By.id("loggedin")); 
        
        WebElement login_submit = driver.findElement(By.id("submitLogin"));
                
        login_submit.click();

        logger.info(("After: " + driver.getTitle()));
        
        System.out.println(driver.getCurrentUrl());
    	
    }


	
}
