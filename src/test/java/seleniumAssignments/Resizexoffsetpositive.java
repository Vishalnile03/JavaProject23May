package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizexoffsetpositive {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(iframe);
		
		WebElement resize = driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-e"));
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 50, 290).perform();
		
	}

}
