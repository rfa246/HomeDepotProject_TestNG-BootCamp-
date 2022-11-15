package HomeDepotWebsiteTest;

import org.testng.annotations.Test;

import Common.utilities;
import HomeDepotWebsite.CreateAcount;
import HomeDepotWebsite.HomePage;

public class HomeDepotPageTest extends utilities{
	
  @Test(priority = 1)
  public void f() throws InterruptedException {
	  HomePage home = new HomePage(driver);
	  home.ClickAccountButton();
	  Thread.sleep(2000);
	home.ClickCreateAountButton();
	home.SelectpersonalAcount();
	Thread.sleep(2000);
	
	CreateAcount acount = new CreateAcount(driver);
	acount.EmailField();
	acount.passwordFiled();
	acount.ZipCdeField();
	acount.PhoneNumField();
	acount.IFrame();
	driver.switchTo().frame(1);
	acount.ClickBox();
driver.switchTo().parentFrame();
	
	
  }
}
