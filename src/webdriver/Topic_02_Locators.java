package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Locators {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		// Khai báo browser driver
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		// Khởi tạo browser
		driver = new ChromeDriver();
		// Set timeout để tìm element
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Phóng to cửa sổ 
		driver.manage().window().maximize();
		// Navigate tới 1 trang web 
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void TC_01_() {
		// ID
//		System.out.println("Before ID");
//		driver.findElement(By.id("small-searchterms"));
//		System.out.println("After ID");
		
		//CLASS NAME
//		System.out.println("Before CLASS");
//		driver.findElement(By.className("inputtext"));
//		System.out.println("After CLASS");
		
		//LINK TEXT
//		driver.findElement(By.linkText("Forgotten password?"));
		
		//PARTIAL LINK TEXT
//		driver.findElement(By.partialLinkText("Forgotten"));
		
		// TAG
//		driver.findElement(By.tagName("a"));
		
		// CSS
//		driver.findElement(By.cssSelector("#email"));
		
		//XPATH
//		driver.findElement( By.xpath("//input[@id='email']"));
	}



	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}