

Feature: Test the login funcitionality 
	Scenario Outline: to login with invalid data and invalid password
    Given user open the bowser and go to login page
    When user fill email as "<username>" and password as "<password>" and click on login
    Then user should still in same page
       
    Examples:
    |	            username				|			password     		|
    |		e778e508e0@catdogmail.live		|		    wrong123!			|
    |										|			Test123!			|
    |		e778e508e0@catdogmail.live		|								|
    |										|								|
    |				wrong@gmail.com			|		    Test123!     		|
    |										|		    wrong123!			|
    |				wrong@gmail.com			|	  							|
    |				wrong@gmail.com			|		   wrong123!			|
 
    
    Scenario: to login with valid data and valid password 
    Given user open the bowser and go to login page
    When user fill email as "e778e508e0@catdogmail.live" and password as "Test123!" and click on login
    Then user should navigate to home page
