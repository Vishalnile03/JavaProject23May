package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffLoginPractice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
	    //WebElement login = driver.findElement(By.className("_1_3w1N"));
	    
		//WebElement login = driver.findElement(By.partialLinkText("pass"));
	    //login.click();
	    
	    //WebElement username = driver.findElement(By.className("_2IX_2- VJZDxU"));
	    
	    //username.sendKeys("9960479360");
	    
	    //WebElement password = driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
	    
	    //password.sendKeys("11031995");
	    
	    
	    
	  
				
				
		
		
		
		
	
		
	}

}
