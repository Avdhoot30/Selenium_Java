package com.utilities;

import org.openqa.selenium.WebDriver;

public class AutomationBase {
	
	public static WebDriver driver;

    public AutomationBase(WebDriver driverInstance) {
    	
        driver = driverInstance;
    }

    public static void launchApp(String url) {
    	
        driver.get(url);
    }
    
}