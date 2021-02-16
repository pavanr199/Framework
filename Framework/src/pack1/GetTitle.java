package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetTitle {
	static WebDriver driver;
	public static void main(String[] args) {

		
//Launch firefox  driver   insted of chrome		
		
		
		System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();

		
	//	driver.get("https://www.pur.com/");
	

		
//Launch Firefox driver		
		
		//System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\geckodriver.exe");
		// driver=new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		
		 driver.get("https://stinger-dev.heledigital.com/stinger/");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.id("truste-consent-button")).click();
		
		driver.findElement(By.linkText("My Account")).click();
		
			
		
//GET TITLE
		
		//1.one way get title
		  // String title =driver.getTitle();
		   
		   
		 //2.another way get title
                //   System.out.println("the title of the page is "+title);
                //   System.out.println(driver.getTitle());
                   
                   
                   
                   
                   
//PAGE URL
                   
                  String url= driver.getCurrentUrl();  
                  System.out.println("page url is " +url);
                   
                  
                   
	}

}
