# Cucumber-and-Selenium-login-test-case
login test cases with all possible scenarios to username and password ( this valid username and valid pass only valid for 6 days )

login scenarios are very important in any website or mobile app so in this project we make a manual test cases for all login scenarios 
in the excel sheet "Manual test cases for login page" you will see the 9 test cases for login 

Selenium is the most powerful tool in automation testing . so we make the test cases by using selenium webdriver by java .
there is an approach which named page pbject pattern . this pattern help us make the code readable and easy for maintenance and reduce the Repetition
so in this project we need a Base class which help us define a webdriver and chrome browser launch it .
the second class was login page . in this class we need to define all elements we will need . so we use a factory approach (FindBy) to get 
username and password and login button and we made login function to pass username and password data to the elements which we found and click on the login button . and we made a check function to make sure that login butto is still visiable to check if the login was be failed .Thread.sleep(3000) this function make the browser wait 3 second before running the next line it help us make sure 
that all elements are be visiable and clickable .
third class was the home page . in this class we define setting and login icons and define a logout function so when we send a valid data we can logout
from this page .

all classes should extend from base class to access the browser and launch it .

in login.feature file we use gherkin language (Feature , Scenario Outline , Scenario , Given , When , Then)

Feature --> title of the test scenario
Scenario Outline  --> when we want to use test case with different data so we but the data in Examples and put Scenario Outline command
Scenario --> describe the test case
Given --> function to describe the initial state to the user
When --> the steps for the test case 
Then --> the expected result from this test case

so in login test cases we need two scenarios . first one with valid username and valid password and the second one to invalid data with all possibilities
the steps was launch the browser and enter the data and click on login button and check if data were valid so go to home page else still in the login page


in login steps we should extend base class and define a Given annotation with the same describe which we put in the feature file so the compiler will compare 
them and run the given annotation with the same describe . in given function we just call the Lunchbrowser() function .
when annotation should define with the same describe in the feature file so in this function we just need to define a loginPage object and call performlogin(username, password) function and pass the value which we store in feature file .
now we have two then function in feature file so we need to define two "then" annotation in loginsteps file with the same describe 
the first then annotation "user should still in same page" we should define an object from loginpage and call the check() function to see if login button still visiable so in this case we make sure that the invalid data test cases are passed and close the browser.
the second then annotation "user should navigate to home page" we should define an object from homepage class and call logout function and then close the 
browser 
so if we send a valid data the login will be done successfully and we will navigate to home page then we will logout and then the test case will be passed 

we use try and catch approach to avoid any error that will crash the project . 


in POM file you will find the dependancy which i used 


this course is very helpful to learn cucumber i recommend it to anyone want to learn cucumber 
"https://www.youtube.com/playlist?list=PLJ2FoWouEU2zZgl9FHFG4AjEDg_2JdBCN"




















