package webdriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_04_WebElement {
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
	public void TC_01_LoginWithEmptyEmailAndPwd() {
		driver.get("http://live.techpanda.org/");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();

		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='send2']"));
		loginBtn.click();

		String emailError1 = driver.findElement(By.xpath("//div[@id='advice-required-entry-email']")).getText();
		String expectedEmailError1 = "This is a required field.";
		Assert.assertEquals(emailError1, expectedEmailError1);

		String pwdError1 = driver.findElement(By.xpath("//div[@id='advice-required-entry-pass']")).getText();
		String expectedPwdError1 = "This is a required field.";
		Assert.assertEquals(pwdError1, expectedPwdError1);

	}

	@Test
	public void TC_02_LoginWithInvalidEmail() {
		driver.get("http://live.techpanda.org/");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();

		WebElement email = driver.findElement(By.xpath("//input[@title='Email Address']"));
		email.sendKeys("123434234@12312.123123");
		WebElement password = driver.findElement(By.xpath("//input[@title='Password']"));
		password.sendKeys("123456");
		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='send2']"));
		loginBtn.click();

		String emailError2 = driver.findElement(By.xpath("//div[@id='advice-validate-email-email']")).getText();
		String expectedEmailError2 = "Please enter a valid email address. For example johndoe@domain.com.";
		Assert.assertEquals(emailError2, expectedEmailError2);

	}

	@Test
	public void TC_03_LoginWithPwdLessThan6Chars() {
		driver.get("http://live.techpanda.org/");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();

		WebElement email = driver.findElement(By.xpath("//input[@title='Email Address']"));
		email.sendKeys("automation@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@title='Password']"));
		password.sendKeys("123");
		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='send2']"));
		loginBtn.click();
		String pwdError2 = driver.findElement(By.xpath("//div[@id='advice-validate-password-pass']")).getText();
		String expectedPwdError2 = "Please enter 6 or more characters without leading or trailing spaces.";
		Assert.assertEquals(pwdError2, expectedPwdError2);
	}

	@Test
	public void TC_04_LoginWithIncorrectData() {
		driver.get("http://live.techpanda.org/");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();

		WebElement email = driver.findElement(By.xpath("//input[@title='Email Address']"));
		email.sendKeys("automation@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@title='Password']"));
		password.sendKeys("123123123");
		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='send2']"));
		loginBtn.click();
		String mgsError = driver.findElement(By.xpath("//span[text()='Invalid login or password.']")).getText();
		String expectedmgsError = "Invalid login or password.";
		Assert.assertEquals(mgsError, expectedmgsError);

	}

	@Test
	public void TC_05_CreateNewAccount() {
		driver.get("http://live.techpanda.org/");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();

		WebElement createAcc = driver.findElement(By.xpath("//span[text()='Create an Account']"));
		createAcc.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstName.sendKeys("meo");
		
		WebElement middleName = driver.findElement(By.xpath("//input[@id='middlename']"));
		middleName.sendKeys("miu");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastName.sendKeys("mao");

		WebElement emailReg = driver.findElement(By.xpath("//input[@id='email_address']"));
		Random randomEmail = new Random();
		int randomInt = randomEmail.nextInt(1000);
		emailReg.sendKeys("meo" + randomInt +"@gmail.com");
		
		WebElement passwordReg = driver.findElement(By.xpath("//input[@id='password']"));
		passwordReg.sendKeys("123456");
		
		WebElement cPasswordReg = driver.findElement(By.xpath("//input[@id='confirmation']"));
		cPasswordReg.sendKeys("123456");
		
		WebElement registerBtn = driver.findElement(By.xpath("//button[@title='Register']"));
		registerBtn.click();
		
		WebElement successMsg = driver.findElement(By.xpath("//span[text()='Thank you for registering with Main Website Store.']"));
		successMsg.getText();
		String expectedSuccessMsg = "Thank you for registering with Main Website Store.";
		Assert.assertEquals(successMsg, expectedSuccessMsg);
		
		
		
		

	}

	@Test
	public void TC_06_LoginWithValidData() {
		driver.get("http://live.techpanda.org/");
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']"));
		myAccount.click();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
