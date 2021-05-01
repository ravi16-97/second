package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome {
	public static WebDriver driver;
  @Test
  
  public void browse() throws Throwable {
	  WebDriverManager.chromedriver().setup(); 
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	driver.get("https://www.youtube.com/watch?v=c86GdHQaLsY");
	Thread.sleep(5000);
	
  }
@AfterTest
public void teardown() {
	driver.quit();
//hello world
}

}
