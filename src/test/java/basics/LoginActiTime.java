package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginActiTime {
	
	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//driver.manage().window().fullscreen();
		
		driver.manage().window().maximize();
		
		//username
		WebElement username = driver.findElement(By.id("username")); 
		//WebElement username= driver.findElement(By.className("input.textField")); this is not unique
		
		username.sendKeys("admin");
		
		Thread.sleep(3000);
		
		//password
		//WebElement password = driver.findElement(By.name("pwd")); by using name locator
		//OR
	    WebElement password = driver.findElement(By.className("pwdfield")); //by using class name locator
		
		password.sendKeys("manager");
		
		Thread.sleep(3000);
		
		//Login
		//WebElement login = driver.findElement(By.id("loginButton")); // by using id locator 
		
		//login.click();
		
		//ForgotPassword 
		
		// WebElement forgotpwd = driver.findElement(By.linkText("Forgot your password?"));
		
		//forgotpwd.click();
		
		//WebElement passrecovery = driver.findElement(By.id("#forgetPasswordEmailOrUsername"));
		
		//passrecovery.sendKeys("admin");
		
		
		
		
		
		
		
		
		
		
		 
		
		
	}
	

}