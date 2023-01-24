@app
Feature: I want to order a product

Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 
	
  @app1
  Scenario: To filter the products
    Given User is on the home page
    When User clicks on drop down
    And selects a filter
    Then User should get the filtered results

  @app2
  Scenario: To add products to cart
    Given User should be on the home page
    And Products are filtered
    When User clicks on add to cart button
    Then Product should be added to the cart

	@app3
	Scenario: To perform checkout
		Given User should be on the cart page
		When User clicks on checkout button
		Then User should be redirected to checkout page
		
	@app4
	Scenario: To add checkout details
		Given User should be on the checkout page
		And Fills checkout information
		When User clicks on the continue button
		Then User should be redirected to review page
		When User clicks on the finish button
		Then Checkout should get complete
	
	@app5
	Scenario: To logout
		Given User logs in
		And User is on home page
		When User clicks on logout button 
		Then User should get logged out 