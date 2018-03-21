package mve;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 
{
	
		static
		{
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		}
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("https://demo.actitime.com/user/submit_tt.do");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Thread.sleep(4000);
			String xp="//div[contains(text(),'Help')]/div[@class='popup_menu_arrow']";
				
			
			  WebElement c = driver.findElement(By.xpath(xp));
			  		
			  c.click();
			  driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
			  WebElement build=driver.findElement(By.xpath("//span[text()='(build 40469)']"));
			  String text=build.getText();
			  System.out.println(text);
			  
			  
			 Thread.sleep(2000);
			 
			
			
		}

}
