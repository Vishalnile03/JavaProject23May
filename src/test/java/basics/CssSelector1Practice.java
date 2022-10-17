package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector1Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
		
		WebElement username = driver.findElement(By.cssSelector("input#myText"));
		
		
		username.sendKeys("vishalnile03@gmail.com");
		
		username.click();
		
		WebElement uusername = driver.findElement(By.cssSelector("button.btn.btn-ohrm.btn-tryit-free"));
		
		Thread.sleep(3000);
		
		//uusername.sendKeys("9960479360");
		
		uusername.click();
		
		Thread.sleep(5000);
		
		WebElement typename = driver.findElement(By.cssSelector("div#Form_getForm_subdomain_Holder"));
		
		typename.sendKeys("vishalnile");
		
		Thread.sleep(5000);
		
		WebElement typefullname = driver.findElement(By.cssSelector("input[placeholder='Your Full Name*']"));
		
		typefullname.sendKeys("Vishal Vasudev Dhangar");
		
		Thread.sleep(5000);
		
		WebElement bussinessemail = driver.findElement(By.cssSelector("input[name='Email']"));
		
		bussinessemail.sendKeys("vishalnile03@gmail.com");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
