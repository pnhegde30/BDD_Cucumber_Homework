@OtherFeature @Regression
Feature: TechFios other login functionality validation 

#Background: 
#	Given User is on the Techfios login page 

@OtherScenario1 
Scenario: 1 User should be able to login with valid credentials 
	Given User is on the Techfios login page 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc123" 
	When User clicks on signin button 
	Then User should land on dashboard page 

@OtherScenario2 
Scenario: 2 User should be able to login with valid credentials 
	Given User is on the Techfios login page 
	When User enters username as "demo2@techfios.com" 
	When User enters password as "abc123" 
	When User clicks on signin button 
	Then User should land on dashboard page 
	
	#@Scenario2 @smoke
#Scenario: 2 User should be able to login with valid credentials 
#	Given User is on the Techfios login page 
#	When User enters username as "demo2@techfios.com" 
#	When User enters password as "abc123" 
#	When User clicks on signin button 
#	Then User should land on dashboard page 
#
#@Scenario3	@smoke
#Scenario: 3 User should be able to login with valid credentials 
#	Given User is on the Techfios login page 
#	When User enters username as "demo@techfios.com" 
#	When User enters password as "abc1234" 
#	When User clicks on signin button 
#	Then User should land on dashboard page 
#
#@Scenario4 @smoke
#Scenario: 4 User should be able to login with valid credentials 
#	Given User is on the Techfios login page 
#	When User enters username as "demo@techfios.com" 
#	When User enters password as "abc124" 
#	When User clicks on signin button 
#	Then User should land on dashboard page 