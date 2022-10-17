package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		
		//XPath AND-----> //HtmlTag[@FirstAttribute='Value' and @SecondAttribute'Value']
		//driver.findElement(By.xpath("//input[@class='textField' and @placeholder='Username']")).sendKeys("admin");
		//Following
		
		
		//XPath Following ----> //HtmlTag[@UniqeAttribute='value']//following::HtmlTag[Find Value Number]
		
		
		//Password
		//driver.findElement(By.xpath("//input[@id='username']//following::input[1]")).sendKeys("manager");
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		//Log In	
		//driver.findElement(By.xpath("//a[@class='initial']")).click();

		
		// Precending ------>
		
		//Log In
		
     	driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[3]")).sendKeys("admin");
     	
     	//Password
     	
     	driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[2]")).sendKeys("manager");
     	
     	//Log In
     	
     	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		
	}

}
