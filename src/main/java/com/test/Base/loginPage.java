package com.test.Base;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.Base.Base;
import org.openqa.selenium.WebElement;
public class loginPage extends Base {
	
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement LoginBtn;
	
	
	
	public void performlogin(String user , String pass) throws InterruptedException {
	try {
		Thread.sleep(3000);
		username.sendKeys(user);
		password.sendKeys(pass);
		Thread.sleep(3000);
		LoginBtn.click();
	}
	catch(Exception e) {
		System.out.println("error");
		
	}
	
	
	}
	public void check() throws InterruptedException {
		try {
		Thread.sleep(3000);
		LoginBtn.isDisplayed();
	}
	
	catch(Exception e) {
		System.out.println("error");
	}
	}
	
	
}
