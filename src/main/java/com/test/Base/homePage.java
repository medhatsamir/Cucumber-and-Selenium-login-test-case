package com.test.Base;
import org.openqa.selenium.support.FindBy;
import com.test.Base.Base;
import org.openqa.selenium.WebElement;
public class homePage extends Base {
	

	@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[2]/div[2]/div")
	WebElement settingIcon;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[2]/div[2]/div/div/a[5]/i")
	WebElement LogOut;

	public void performlogout() throws InterruptedException {
		try{
			Thread.sleep(3000);
			settingIcon.click();
			LogOut.click();
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}
	
}
