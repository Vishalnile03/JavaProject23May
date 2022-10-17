package basics;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPractice {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup(); //ChromeDriver
		
		//ChromeDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup(); //FirefoxDriver
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();  // EdgeDriver
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://majhinaukri.in/dvet-recruitment/");
		
		
		
		
		 
	 

	}

}
