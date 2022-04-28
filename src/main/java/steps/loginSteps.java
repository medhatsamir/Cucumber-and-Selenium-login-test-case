package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.Base.Base;
import com.test.Base.homePage;
import com.test.Base.loginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps extends Base {
		loginPage loginpage ;
		homePage homepage ;
	@Given("user open the bowser and go to login page")
	public void user_open_the_webisite_and_go_to_login_page() {
		Base.Lunchbrowser();
		
	
	}
	
	@When("user fill email as {string} and password as {string} and click on login")
	public void user_fill_email_and_password_and_click_on_login(String username , String password) throws InterruptedException {
		loginpage = new loginPage();
		loginpage.performlogin(username, password);
	

	}

	@Then("user should still in same page")
	public void user_should_still_in_the_same_page() throws InterruptedException {
		loginpage = new loginPage();
		loginpage.check();
		driver.close();
	}
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() throws InterruptedException {
		homepage = new homePage();
		homepage.performlogout();
		driver.close();

	}
	
	

}
