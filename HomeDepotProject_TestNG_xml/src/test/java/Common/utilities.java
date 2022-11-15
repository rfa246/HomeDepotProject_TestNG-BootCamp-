package Common;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utilities {
  
	 public WebDriver driver;
	  @Parameters({"browser","website"})
	  
	  @BeforeClass
		  public void Ibrowsers(String NameofBrowser , String wb) {
		  if(NameofBrowser.equals("Chrome")) {
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			  driver.get(wb);
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  }else if(NameofBrowser.equals("Edge")) {
			  WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
			  driver.get(wb);
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  
		  }
			  
			  
  }

  @AfterClass
  public void AfterTestClass() {
	  
  }
  
  public void Screenshot(String folder) throws IOException {
	  String jk = System.getProperty("user.dir");//any other want ur project
	  System.out.println(jk);
	  Date ob = new Date();
	  System.out.println(ob);
	  String files=ob.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(files);
	  File pages=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(pages, new File(jk+"\\ScreenShots\\"+folder+"\\"+files+"Home3.jpg"));
  }
}