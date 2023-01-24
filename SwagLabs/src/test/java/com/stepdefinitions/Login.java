package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.page.objects.PageObjects;
import com.utilities.AutomationBase;
import com.utilities.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login extends Utility {

	public Login() {}
	
	public Login(WebDriver driverInstance) {
		
        super(driverInstance);
    }
		
	@Given("User is on Login page")
	public void user_is_on_login_page() throws Exception {
		
		AutomationBase.launchApp(getAppUrl());		
	}

	@And("User Clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		
		Thread.sleep(1000);
		clickElement(PageObjects.login);		
	}

	@Then("Invalid request message should appear")
	public void invalid_request_message_should_appear() {

		if(Utility.Warning()) {
			
			System.out.println("Warning Verified!");
		}
	}

	@Given("User enters only username with <{string}>")
	public void user_enters_only_username_with(String string) throws InterruptedException {

		sendKeys(PageObjects.username,string);
		Thread.sleep(1000);
		clickElement(PageObjects.login);
		
		if(Utility.Warning()) {
			
			System.out.println("Warning Verified!");
		}
	}
	
	@Given("User enters only password with <{string}>")
	public void user_enters_only_password_with(String string) throws InterruptedException {
		
		sendKeys(PageObjects.password,string);
		Thread.sleep(1000);
		clickElement(PageObjects.login);

		if(Utility.Warning()) {
			
			System.out.println("Warning Verified!");
		}
	}
	
	@Given("User enters wrong username with <{string}>")
	public void user_enters_wrong_username_with(String string) throws InterruptedException {
		
		Thread.sleep(1000);
		sendKeys(PageObjects.username,string);
	}

	@Given("User enters wrong password with <{string}>")
	public void user_enters_wrong_password_with(String string) throws InterruptedException {

		sendKeys(PageObjects.password,string);
		Thread.sleep(1000);
		clickElement(PageObjects.login);
	}

	@Then("User is not logged in")
	public void user_is_not_logged_in() {
		
		System.out.println("User not logged in!");
	}

	@Given("User enters username with <{string}>")
	public void user_enters_username_with(String string) throws InterruptedException {
		
		Thread.sleep(1000);
		sendKeys(PageObjects.username,string);
	}

	@Given("User enters password with <{string}>")
	public void user_enters_password_with(String string) throws InterruptedException {

		sendKeys(PageObjects.password,string);
		Thread.sleep(1000);
		clickElement(PageObjects.login);
	}

	@Then("User is logged in")
	public void user_is_logged_in() throws InterruptedException {
		
		Thread.sleep(1000);
		Utility.AssertTitle("PRODUCTS");
	}
}