package testing.publish;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Sample4Test {
	WebDriver driver ;

  @Test(description="To Open a chrome browser")
  public void openApplication() {
	  //driver.get("http://www.google.com");
	  System.out.println("Now the output is redirected!");
  }
  @BeforeMethod
  public void beforeMethod() {
	 // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	//  driver = new ChromeDriver();
	  System.out.println("Now the output is redirected!");
  }

  @AfterMethod
  public void afterMethod() {
	//  driver.quit();
	  System.out.println("Now the output is redirected!");
  }

}
