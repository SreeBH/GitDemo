package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 {
		
		WebDriver driver;
		@Test
		public void test1(){
			WebDriverManager.chromedriver().setup();
			System.out.println("hi");
			driver=new ChromeDriver();
			driver.get("https://www.seleniumhq.org");
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//a[contains(.,'Download')]")).click();
			System.out.println(driver.getTitle());
			
			
			
		}
	}