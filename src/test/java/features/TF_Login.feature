@LoginFeature @Regression
Feature: TechFios login functionality validation 

#Background: 
#	Given User is on the Techfios login page 

@Scenario1 @smoke
Scenario Outline: 1 User should be able to login with valid credentials 
	Given User is on the Techfios login page 
	When User enters username as "<username>" 
	When User enters password as "<password>" 
	When User clicks on signin button 
	Then User should land on dashboard page
	Examples:
	|username|passwword|
	|demo@techfios.com|abc123| 
	|demo2@techfios.com|abc123|
	|demo@techfios.com|abc124|
	|demo2@techfios.com|abc124|

	
	#Scenario Outline: User should be able to login with valid credentials 
	#	Given User is on the Techfios login page 
	#	When User enters username as "demo@techfios.com" 
	#	When User enters password as "abc123" 
	#	When User clicks on signin button 
	#	Then User should land on dashboard page