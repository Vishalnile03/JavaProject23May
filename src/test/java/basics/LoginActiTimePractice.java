package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginActiTimePractice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://demo.actitime.com/login.do");
        
        WebElement username = driver.findElement(By.id("loginButton"));
        
        username.sendKeys("admin");
        
        WebElement passaword = driver.findElement(By.name("pwd"));
        
        passaword.sendKeys("manager");
        
        WebElement login = driver.findElement(By.id("loginButton"));
        
        login.click();
        
        WebElement forgotpwd = driver.findElement(By.linkText("Forgot your password?"));
        
        forgotpwd.click();
        
        
        
        
		
		
	}

}
