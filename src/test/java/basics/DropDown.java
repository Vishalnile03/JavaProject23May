package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		WebElement dropdown = driver.findElement(By.cssSelector("#searchDropdownBox"));  //#idvalue, HtmlTag#idvalue, HtmlTag[id='value']
		
		//driver.findElement(By.xpath("//input[@id='searchDropdownBox']")); 
		
		Thread.sleep( 5000);
		
		//Classname ref_variable = new Classname();
		
		Select select =new Select(dropdown);
		
		//select.selectByVisibleText("Books");
		
		//select.selectByIndex(04);   // Amazon Fresh   //index value start from 0 
		
		select.selectByValue("search-alias=electronics");    //Electronics
		
		

	}

}
