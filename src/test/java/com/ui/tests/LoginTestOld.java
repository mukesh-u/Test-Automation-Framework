package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTestOld {

	public static void main(String[] args) {
		
        WebDriver wd = new ChromeDriver();
        BrowserUtility browserUtility= new BrowserUtility(wd);
        
        browserUtility.goToWebsite("http://www.automationpractice.pl/");
        browserUtility.maximizeWindow();   
        
        By signInLinkLocator= By.xpath("//a[contains(text(),\"Sign in\")]");
        browserUtility.clickOn(signInLinkLocator);
        
        By emailTextBoxLocator = By.id("email");
        browserUtility.enterText(emailTextBoxLocator, "teroj95846@adrewire.com");
        
        By passwordTextBoxLocator = By.id("passwd");
        browserUtility.enterText(passwordTextBoxLocator, "Password");
        
        By submitLoginButtonLocator = By.id("SubmitLogin");
        browserUtility.click(submitLoginButtonLocator);
       
        
	}

}
