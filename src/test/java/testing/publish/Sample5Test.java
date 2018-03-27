package testing.publish;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Sample5Test {
	WebDriver driver ;

  @Test(description="To Open a chrome browser")
  public void openApplication() {
	  driver.get("http://www.google.com");
	  Assert.assertEquals(1, 3);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
