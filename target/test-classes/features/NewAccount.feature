@NewAccount @Regression
Feature: Techfios bank and cash new Account functionality 

#Background: 
#	Given User is on the Techfios login page

@NewScenario1
Scenario Outline: User should be able to login in with valid credentials and Add New Account
	Given User is on the techfios login page    
	When User enters username as "<username>" and password as "<password>" 
	When User clicks on the signin button  
	#Then User should land on dashboard page
	Then User clicks on Bank & Cash button  
	Then User clicks on New Account 
	#Then User should be able to see the Add New Account page 
	Then User fills up the information by entering "<accountTitle>" and "<description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" and "<phone>" and "<internetBankingURL>" 
	Then User will click on the submit button
	Examples:
	|username|passwword| accountTitle| description | initialBalance| accountNumber| contactPerson| phone| internetBankingURL|
	|demo@techfios.com|abc123| New Balance| A test account| 10000 | 12345566789 | Marty McFly| 555-555-5555|https://www.google.com/ |