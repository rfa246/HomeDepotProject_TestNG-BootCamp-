package HomeDepotWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	
	public class HomePage {
		WebDriver driver;
	@FindBy(linkText = "My Account")WebElement accountclick;
	@FindBy(xpath = "(//*[text()='Create an Account'])[4]")WebElement createaccount;
	@FindBy(xpath  = "(//span[text()='Select & Continue'])[1]")WebElement selectaccount;
	

	public void ClickAccountButton () {
		accountclick.click();
		
	}
	public void ClickCreateAountButton() {
		createaccount.click();
	}
	public void SelectpersonalAcount() {
		selectaccount.click();
	}
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	}


