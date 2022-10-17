package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resizable/");
		
		//Iframe
		WebElement iftame = driver.findElement(By.xpath("//iframe[@class='demo-free']"));
		driver.switchTo().frame(iftame);
		
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']child::div[3]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 150, -70).perform();
		

	}

}
