package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement sliderForword= driver.findElement(By.xpath("//div[@id='green']"));
		
		Thread.sleep(3000);
		Actions green = new Actions(driver);
		green.dragAndDropBy(sliderForword, 0, 120).perform();

	}

}
