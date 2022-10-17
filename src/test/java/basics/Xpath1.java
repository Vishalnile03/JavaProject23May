package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9960479360");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU' and @type='password']")).sendKeys("11031995");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles" + Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_5THWM1']//following::div[4]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@data-id='MOBGHWFH7STEFFVC']//descendant::div[10]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_3pLy-c row']//following::div[3]")).click();
		
		//driver.findElement(By.xpath("//div[@data-id='MOBGHWFH7STEFFVC']//descendant::div[10]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='_1fGeJ5 qaAL3J']")).click();
		
		
		
		
	}

}
