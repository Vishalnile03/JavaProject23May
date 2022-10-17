package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector3 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9960479360");
	
		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("11031995");
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL")).click();
		
		//WebElement closewindow = driver.findElement(By.cssSelector("._2KpZ6l._2doB4z"));
		
		//closewindow.click();
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);
		
		Thread.sleep(3000);
		
	//	driver.findElement(By.cssSelector("div._5THWM1>*:nth-child(4)")).click();
		
		driver.findElement(By.cssSelector("div._5THWM1>div:nth-of-type(4)")).click();
				
		
		
		
		
		
	}

}
