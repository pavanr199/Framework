package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Droupdown {
 
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\geckodriver.exe");
		 driver=new FirefoxDriver();
		
		 driver.get("https://www.facebook.com/reg/");
	
		 /*
		driver.manage().window().maximize();
	//before select	
		Select month=new Select(driver.findElement(By.name("birthday_month")));
		
        WebElement defaultvalue =month.getFirstSelectedOption();
		
		System.out.println("before selecting "+defaultvalue);
		//after selecting
		   month.selectByIndex(5);
		
		   WebElement defaultvalue1 =month.getFirstSelectedOption();
			
			System.out.println("after  selecting "+defaultvalue1);
		
		*/
		
		    driver.findElement(By.name("firstname")).sendKeys("pavan");
		
		    driver.findElement(By.name("lastname")).sendKeys("racha");
		    
		    driver.findElement(By.name("reg_email__")).sendKeys("9603565701");
		
		    driver.findElement(By.id("password_step_input")).sendKeys("racha@1996");
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByValue("25");
				
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(2);
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1996");

	}

}
