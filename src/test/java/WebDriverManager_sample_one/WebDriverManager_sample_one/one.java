package WebDriverManager_sample_one.WebDriverManager_sample_one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class one
{
	public static WebDriver driver ;
	public static WebDriver driver1 ;
	@Test
	public void open_chrome()
	{
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    
	    WebDriverManager.firefoxdriver().setup();
	    driver =  new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    
	    driver.quit();
	}
	
	@Test
	public void open_firefox()
	{   
	    WebDriverManager.firefoxdriver().setup();
	    driver1 =  new ChromeDriver();
	    driver1.manage().window().maximize();
	    driver1.get("https://opensource-demo.orangehrmlive.com/");
	    driver1.manage().window().maximize();
	    
	    driver.quit();
	}
}
