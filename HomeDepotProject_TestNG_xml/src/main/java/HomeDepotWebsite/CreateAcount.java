package HomeDepotWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAcount {
	WebDriver driver;
	
	@FindBy(id = "email")WebElement email;
	@FindBy(id = "password-input-field")WebElement password;
	@FindBy(id = "zipCode")WebElement zipcode;
	@FindBy(id = "phone")WebElement phonenum;
	@FindBy(xpath = "(//*[@class='checkbox-btn'])[2]")WebElement verify;
	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")WebElement iframe;
	@FindBy(className = "recaptcha-checkbox-border")WebElement box;
	
	public void EmailField() {
		email.sendKeys("rj00@gmail.com");
	}
	public void passwordFiled() {
		password.sendKeys("Reema@12345");
	}
	public void ZipCdeField() {
		zipcode.sendKeys("20148");
	}
	public void PhoneNumField() {
		phonenum.sendKeys("5556662323");
	}
	
	public void IFrame() {
		iframe.click();
	}
	public void ClickBox() {
		box.click();
	}
	
	
	public CreateAcount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
