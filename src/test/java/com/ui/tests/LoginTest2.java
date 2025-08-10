package com.ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;

public class LoginTest2 {
	
	public static void main (String[] args) {
		
		WebDriver wd = new ChromeDriver();
		HomePage homepage = new HomePage(wd);
		LoginPage loginPage=homepage.goToLoginPage();
		loginPage.doLoginWith("teroj95846@adrewire.com", "Password");
	}
}
