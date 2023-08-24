package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_10_Frame_iFrame_Window_Tab {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	//Switch to Frames by Index
	@Test
	public void  SwitchByIndex() {
		driver.get("https://skills.kynaenglish.vn/");
		driver.switchTo().frame(0);
	}
	
//	//Switch to Frames by Name/ID
//		@Test
//		public void  SwitchByName() {
//			
//		}
//		
//	//Switch to Frames by WebElement
//		@Test
//		public void  SwitchByWebElement() {
//			
//		}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
}
	
}
