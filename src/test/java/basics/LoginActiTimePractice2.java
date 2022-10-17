package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginActiTimePractice2 {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		
		username.sendKeys("standard_user");
		
		WebElement passaword = driver.findElement(By.id("password"));
		
		passaword.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.id("login-button"));
		
		login.click();
		
		
		
		
		
		
		
		
		
		
	}

}
