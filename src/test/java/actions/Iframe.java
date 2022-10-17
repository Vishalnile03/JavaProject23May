package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		//Iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		// to drag from source to destination
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));    //source
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));    // destination
		
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		

	}

}
