package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_04_WebBrowser {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void TC_01_verifyUrl() {

		driver.get("http://live.techpanda.org");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();
		String loginPageUrl = driver.getCurrentUrl();
		System.out.println("The login Page URL is: " + loginPageUrl);
		Assert.assertEquals(loginPageUrl, "http://live.techpanda.org/index.php/customer/account/login/");

		WebElement createAcc = driver.findElement(By.xpath("//span[text()='Create an Account']"));
		createAcc.click();
		String accountPageUrl = driver.getCurrentUrl();
		System.out.println("The Account Page URL is: " + accountPageUrl);
		Assert.assertEquals(accountPageUrl, "http://live.techpanda.org/index.php/customer/account/create/");

	}

	@Test
	public void TC_02_Title() {

		driver.get("http://live.techpanda.org");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();
		String loginPageTitle = driver.getTitle();
		System.out.println("The login Page Title is: " + loginPageTitle);
		Assert.assertEquals(loginPageTitle, "Customer Login");

		WebElement createAcc = driver.findElement(By.xpath("//span[text()='Create an Account']"));
		createAcc.click();
		String accountPageTitle = driver.getTitle();
		System.out.println("The Account Page Title is: " + accountPageTitle);
		Assert.assertEquals(accountPageTitle, "Create New Customer Account");

	}

	@Test
	public void TC_03_navigateFunction() {

		driver.get("http://live.techpanda.org");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();

		WebElement createAcc = driver.findElement(By.xpath("//span[text()='Create an Account']"));
		createAcc.click();

		String accountPageUrl = driver.getCurrentUrl();
		System.out.println("The Account Page URL is: " + accountPageUrl);
		Assert.assertEquals(accountPageUrl, "http://live.techpanda.org/index.php/customer/account/create/");
		driver.navigate().back();

		String loginPageUrl = driver.getCurrentUrl();
		System.out.println("The login Page URL is: " + loginPageUrl);
		Assert.assertEquals(loginPageUrl, "http://live.techpanda.org/index.php/customer/account/login/");
		driver.navigate().forward();

		String accountPageTitle = driver.getTitle();
		System.out.println("The Account Page Title is: " + accountPageTitle);
		Assert.assertEquals(accountPageTitle, "Create New Customer Account");

	}

	@Test
	public void TC_04_getPageSourceCode() {

		driver.get("http://live.techpanda.org");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();

		driver.getPageSource().contains("Login or Create an Account");

		WebElement createAcc = driver.findElement(By.xpath("//span[text()='Create an Account']"));
		createAcc.click();
		driver.getPageSource().contains("Create an Account");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
