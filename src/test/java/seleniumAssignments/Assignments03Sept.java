package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignments03Sept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		driver.findElement(By.xpath("//input[@id='g2599-name']")).sendKeys("Vishal");
		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vishalnile6@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='url']")).sendKeys("https://www.globalsqa.com/samplepagetest/");
		
		//driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']//following::option[3]")).click();
		
		WebElement dropdown = driver.findElement(By.cssSelector("#g2599-experienceinyears"));
		
		Select select = new Select(dropdown);
		
		select.selectByValue("5-7");
		
		
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@class='grunion-field-label']//following::label[2]")).click();
		
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//input[@name='g2599-education']")).click();
		
		driver.findElement(By.xpath("//textarea[@class='textarea']")).sendKeys("Selenium Assignments Sept 03");
		
		
	}

}
