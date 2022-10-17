package basics;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector4PracticeFlipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9960479360");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("11031995");
		
		driver.findElement(By.cssSelector("._2KpZ6l._2HKlqd._3AWRsL")).click();
		
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("Mobiles" + Keys.ENTER);
		
		Thread.sleep(3000);
		
		//Locate Electronics
		//driver.findElement(By.cssSelector("div._1kidPb>span:first-child"));
		//Or
		//driver.findElement(By.xpath("//div[@class='_1kidPb']//child::span[1]"));
		//Or
		//driver.findElement(By.xpath(""));      //try with following
		//Or
		WebElement element = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		
	}

}
