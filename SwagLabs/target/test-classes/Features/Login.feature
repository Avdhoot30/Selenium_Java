@login
Feature: Verification of Login page functionality

Background: User is on Swag Labs page
	@login1
  Scenario: To validate if the user has not entered any credentials.
    Given User is on Login page
    And User Clicks on login button
    Then Invalid request message should appear
    
  @login2
  Scenario Outline: To validate if user has entered only username
  	Given User is on Login page 
    And User enters only username with <"<username>"> 	
    And User Clicks on login button
    Then Invalid request message should appear
    
    Examples:
    	|username|
    	|standard_user|
    	
  @login3
  Scenario Outline: To validate if user has entered only password
  	Given User is on Login page
    And User enters only password with <"<password>">
    And User Clicks on login button
    Then Invalid request message should appear
 
    Examples: 
      |password|   
      |secret_sauce| 
 
  @login4
  Scenario Outline: To validate if the user has entered the invalid credentials and redirection not happens to the home page.
    Given User is on Login page
    And User enters wrong username with <"<username>"> 	
    And User enters wrong password with <"<password>">
    Then User is not logged in
 
    Examples: 
      |username|password|   
      |abc|abc|
            
  @login5
  Scenario Outline: To validate if the user has entered the valid credentials and redirection happens to the home page.
    Given User is on Login page
    And User enters username with <"<username>"> 	
    And User enters password with <"<password>">
    Then User is logged in
 
    Examples: 
      |username|password|   
      |standard_user|secret_sauce|   