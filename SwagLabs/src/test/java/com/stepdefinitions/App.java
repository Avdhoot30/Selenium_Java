package com.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.page.objects.PageObjects;
import com.utilities.AutomationBase;
import com.utilities.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class App extends Utility {
	
	public App() {}
	
	public App(WebDriver driverInstance) {
		
        driver = driverInstance;
    }
	
	String user = "standard_user";
	String pass = "secret_sauce";
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() throws IOException {

		AutomationBase.launchApp(getAppUrl());
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() throws InterruptedException {

		PageObjects.username.click();
		Utility.sendKeys(PageObjects.username,user);
		Thread.sleep(1000);
		sendKeys(PageObjects.password,pass);
		Thread.sleep(1000);
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {

	    clickElement(PageObjects.login);
	}
	
	@Given("User is on the home page")
	public void user_is_on_the_home_page() throws IOException, InterruptedException {
		
		Thread.sleep(1000);
		Utility.AssertTitle("PRODUCTS");
	}

	@When("User clicks on drop down")
	public void user_clicks_on_drop_down() throws InterruptedException {
		
		Thread.sleep(1000);
		clickElement(PageObjects.dropdown);
	}

	@When("selects a filter")
	public void selects_a_filter() throws InterruptedException {
		
		Thread.sleep(1000);
		SelectFilter();
	}

	@Then("User should get the filtered results")
	public void user_should_get_the_filtered_results() throws IOException, InterruptedException {
		
		Thread.sleep(1000);
		Utility.AssertFilter("Price (low to high)");		
	}

	@Given("User should be on the home page")
	public void user_should_be_on_the_home_page() throws IOException, InterruptedException {
		
		Thread.sleep(1000);
		Utility.AssertTitle("PRODUCTS");	    
	}

	@And("Products are filtered")
	public void products_are_filtered() throws IOException, InterruptedException {
		
		Thread.sleep(1000);
		clickElement(PageObjects.dropdown);
		Thread.sleep(1000);
		SelectFilter();
		Thread.sleep(1000);
		Utility.AssertFilter("Price (low to high)");
		Thread.sleep(1000);
	}

	@When("User clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws IOException, InterruptedException {
	   
		AddCart();
		Thread.sleep(1000);
	}

	@Then("Product should be added to the cart")
	public void product_should_be_added_to_the_cart() {
		
		Utility.AssertCart("2");
	}
	
	@Given("User should be on the cart page")
	public void user_should_be_on_the_cart_page() throws IOException, InterruptedException {
		
		Thread.sleep(1000);
		AddCart();
		Thread.sleep(1000);
		clickElement(PageObjects.cart);
		Thread.sleep(1000);
		Utility.AssertTitle("YOUR CART");	    
	}

	@When("User clicks on checkout button")
	public void user_clicks_on_checkout_button() throws IOException, InterruptedException {
		
		Thread.sleep(1000);
		clickElement(PageObjects.checkout);		
	}

	@Then("User should be redirected to checkout page")
	public void user_should_be_redirected_to_checkout_page() throws InterruptedException {
		
		Thread.sleep(1000);
		Utility.AssertTitle("CHECKOUT: YOUR INFORMATION");
	}
	
	@Given("User should be on the checkout page")
	public void user_should_be_on_the_checkout_page() throws IOException, InterruptedException {
		
		Thread.sleep(1000);
		AddCart();
		Thread.sleep(1000);
		clickElement(PageObjects.cart);
		Thread.sleep(1000);
		Utility.AssertTitle("YOUR CART");	    
	}

	@When("Fills checkout information")
	public void fills_checkout_information() throws IOException, InterruptedException {
				
		clickElement(PageObjects.checkout);
		clickElement(PageObjects.firstname);
		sendKeys(PageObjects.firstname,"Ramesh");
		Thread.sleep(1000);
		
		clickElement(PageObjects.lastname);
		sendKeys(PageObjects.lastname,"Sharma");
		Thread.sleep(1000);
		
		clickElement(PageObjects.postal);
		sendKeys(PageObjects.postal,"123456");
		Thread.sleep(1000);
	}

	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
	   
		clickElement(PageObjects.next);
	}

	@Then("User should be redirected to review page")
	public void user_should_be_redirected_to_review_page() throws InterruptedException {
		
		Thread.sleep(1000);
		Utility.AssertTitle("CHECKOUT: OVERVIEW");
	}

	@When("User clicks on the finish button")
	public void user_clicks_on_the_finish_button() throws InterruptedException {
		
		Thread.sleep(1000);
		clickElement(PageObjects.finish);
	}

	@Then("Checkout should get complete")
	public void checkout_should_get_complete() throws InterruptedException {
		
		Thread.sleep(1000);
		Utility.AssertTitle("CHECKOUT: COMPLETE!");
	}
	
	@Given("User logs in")
	public void user_logs_in() {
		
		System.out.println("User logs in");
	}

	@And("User is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		
		Thread.sleep(1000);
		Utility.AssertTitle("PRODUCTS");
	}

	@When("User clicks on logout button")
	public void user_clicks_on_logout_button() throws InterruptedException {
		
		Thread.sleep(1000);
		clickElement(PageObjects.hamburger);
		clickElement(PageObjects.logout);		
	}

	@Then("User should get logged out")
	public void user_should_get_logged_out() {
	   
		System.out.println("User is logged out");
	}
}