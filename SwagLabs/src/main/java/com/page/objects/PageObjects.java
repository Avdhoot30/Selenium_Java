package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Utility;

public class PageObjects extends Utility{
	
	WebDriver driver;

	public PageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}
	
	@FindBy(xpath = "//input[@id='user-name']")
	public static WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	public static WebElement login;

	@FindBy(xpath = "//h3[@data-test='error']")
	public static WebElement invalid;
	
	@FindBy(xpath = "//span[@class='title']")
	public static WebElement title;

	@FindBy(xpath = "//select[@class='product_sort_container']")
	public static WebElement dropdown;
	
	@FindBy(xpath = "//select[@class='product_sort_container']//option[@selected='selected']")
	public static WebElement dropdownAssert;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	public static WebElement item1;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	public static WebElement item2;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	public static WebElement cart;

	@FindBy(xpath = "//button[@id='checkout']")
	public static WebElement checkout;
	
	@FindBy(xpath = "//input[@id='last-name']")
	public static WebElement lastname;
	
	@FindBy(xpath = "//input[@id='first-name']")
	public static WebElement firstname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	public static WebElement postal;

	@FindBy(xpath = "//input[@id='continue']")
	public static WebElement next;
	
	@FindBy(xpath = "//button[@id='finish']")
	public static WebElement finish;

	@FindBy(xpath = "//button[@id='back-to-products']")
	public static WebElement back;
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	public static WebElement hamburger;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	public static WebElement logout;
	
	@FindBy(css = ".shopping_cart_badge")
	public static WebElement bagde;
	
}
