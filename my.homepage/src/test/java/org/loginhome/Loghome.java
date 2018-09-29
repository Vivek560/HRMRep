package org.loginhome;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Loghome {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selineum\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://apps.qaplanet.in/qahrm/login.php");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
