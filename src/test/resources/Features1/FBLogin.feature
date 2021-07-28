Feature: Facebook login Validation

Background:
	Given launch the browser
    And open facebook url
@Valid @Invalid
 Scenario: Facebook login validation with valid credentials
   
    When enter the username and passowrd
    |Username|Password|
    |user1|pass1|  
    |user2|pass2|  
    Then click the login button
    And valdate the welcome message
    
@Invalid
 Scenario: Facebook login validation with invalid credentials
   
		When enter the username and passowrd
	|Username|Password|
   |user1|pass1|  
   |user2|pass2|   
    Then click the login button
    And valdate the welcome message
 
  Scenario Outline: Facebook login validation with All credentials
    
    When enter the "<username>" and "<passowrd>"
    Then click the login button
    And valdate the welcome message
    
    Examples:
	|username|password|
	|thillai|arasu|
	