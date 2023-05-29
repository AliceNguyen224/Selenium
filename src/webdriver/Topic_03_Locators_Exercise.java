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

public class Topic_03_Locators_Exercise {
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
	public void TC_01_RegisterWithEmptyData() {
		driver.get("https://alada.vn/tai-khoan/dang-ky.html");

		WebElement register = driver.findElement(By.xpath("//button[@type='submit']"));
		register.click();

		String FirstnameError = driver.findElement(By.xpath("//label[@id='txtFirstname-error']")).getText();
		String ExpectedNameError = "Vui lòng nhập họ tên";
		Assert.assertEquals(FirstnameError, ExpectedNameError);

		String EmailError = driver.findElement(By.xpath("//label[@id='txtEmail-error']")).getText();
		String ExpectedEmailError = "Vui lòng nhập email";
		Assert.assertEquals(EmailError, ExpectedEmailError);

		String ConfirmEmailError = driver.findElement(By.xpath("//label[@id='txtCEmail-error']")).getText();
		String ExpectedConfirmEmailError = "Vui lòng nhập lại địa chỉ email";
		Assert.assertEquals(ConfirmEmailError, ExpectedConfirmEmailError);

		String PwdError = driver.findElement(By.xpath("//label[@id='txtPassword-error']")).getText();
		String ExpectedPwdError = "Vui lòng nhập mật khẩu";
		Assert.assertEquals(PwdError, ExpectedPwdError);

		String ConfirmPwdError = driver.findElement(By.xpath("//label[@id='txtCPassword-error']")).getText();
		String ExpectedConfirmPwdError = "Vui lòng nhập lại mật khẩu";
		Assert.assertEquals(ConfirmPwdError, ExpectedConfirmPwdError);

		String PhoneError = driver.findElement(By.xpath("//label[@id='txtPhone-error']")).getText();
		String ExpectedPhoneError = "Vui lòng nhập số điện thoại.";
		Assert.assertEquals(PhoneError, ExpectedPhoneError);

		sleepInSecond(3);
	}

	@Test
	public void TC_02_RegisterWithInvalidEmail() {

		WebElement Firstname = driver.findElement(By.xpath("//input[@id='txtFirstname']"));
		Firstname.sendKeys("Ngan Nguyen");

		WebElement Email = driver.findElement(By.xpath("//input[@id='txtEmail']"));
		Email.sendKeys("123@456@789");

		WebElement CEmail = driver.findElement(By.xpath("//input[@id='txtCEmail']"));
		CEmail.sendKeys("123@456@789");

		WebElement Password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.sendKeys("abcdef");

		WebElement CPassword = driver.findElement(By.xpath("//input[@id='txtCPassword']"));
		CPassword.sendKeys("abcdef");

		WebElement Phone = driver.findElement(By.xpath("//input[@id='txtPhone']"));
		Phone.sendKeys("0985637133");

		WebElement register = driver.findElement(By.xpath("//button[@type='submit']"));
		register.click();

		String EmailError = driver.findElement(By.xpath("//label[@id='txtEmail-error']")).getText();
		String ExpectedEmailError = "Vui lòng nhập email hợp lệ";
		Assert.assertEquals(EmailError, ExpectedEmailError);

		String ConfirmEmailError = driver.findElement(By.xpath("//label[@id='txtCEmail-error']")).getText();
		String ExpectedConfirmEmailError = "Email nhập lại không đúng";
		Assert.assertEquals(ConfirmEmailError, ExpectedConfirmEmailError);

		sleepInSecond(3);
	}

	@Test
	public void TC_03_RegisterWithIncorrectConfirmEmail() {

		WebElement Email = driver.findElement(By.xpath("//input[@id='txtEmail']"));
		Email.clear();
		Email.sendKeys("abc@gmail.com");

		WebElement CEmail = driver.findElement(By.xpath("//input[@id='txtCEmail']"));
		CEmail.clear();
		CEmail.sendKeys("abc@gmail.net");

		WebElement register = driver.findElement(By.xpath("//button[@type='submit']"));
		register.click();

		String ConfirmEmailError = driver.findElement(By.xpath("//label[@id='txtCEmail-error']")).getText();
		String ExpectedConfirmEmailError = "Email nhập lại không đúng";
		Assert.assertEquals(ConfirmEmailError, ExpectedConfirmEmailError);

		sleepInSecond(3);

	}

	@Test
	public void TC_04_RegisterWithPasswordLessThan6Characters() {

		WebElement CEmail = driver.findElement(By.xpath("//input[@id='txtCEmail']"));
		CEmail.clear();
		CEmail.sendKeys("abc@gmail.com");

		WebElement Password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.clear();
		Password.sendKeys("abc");

		WebElement CPassword = driver.findElement(By.xpath("//input[@id='txtCPassword']"));
		CPassword.clear();
		CPassword.sendKeys("abc");

		WebElement register = driver.findElement(By.xpath("//button[@type='submit']"));
		register.click();

		String PwdError = driver.findElement(By.xpath("//label[@id='txtPassword-error']")).getText();
		String ExpectedPwdError = "Mật khẩu phải có ít nhất 6 ký tự";
		Assert.assertEquals(PwdError, ExpectedPwdError);

		String ConfirmPwdError = driver.findElement(By.xpath("//label[@id='txtCPassword-error']")).getText();
		String ExpectedConfirmPwdError = "Mật khẩu phải có ít nhất 6 ký tự";
		Assert.assertEquals(ConfirmPwdError, ExpectedConfirmPwdError);

		sleepInSecond(3);

	}

	@Test
	public void TC_05_RegisterWithIncorrectConfirmPassword() {

		WebElement Password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.clear();
		Password.sendKeys("abcdef");

		WebElement CPassword = driver.findElement(By.xpath("//input[@id='txtCPassword']"));
		CPassword.clear();
		CPassword.sendKeys("abcetg");

		WebElement register = driver.findElement(By.xpath("//button[@type='submit']"));
		register.click();

		String ConfirmPwdError = driver.findElement(By.xpath("//label[@id='txtCPassword-error']")).getText();
		String ExpectedConfirmPwdError = "Mật khẩu bạn nhập không khớp";
		Assert.assertEquals(ConfirmPwdError, ExpectedConfirmPwdError);

		sleepInSecond(3);

	}

	@Test
	public void TC_06_RegisterWithInvalidPhoneNumber_1() {

		WebElement CPassword = driver.findElement(By.xpath("//input[@id='txtCPassword']"));
		CPassword.clear();
		CPassword.sendKeys("abcdef");

		WebElement Phone = driver.findElement(By.xpath("//input[@id='txtPhone']"));
		Phone.clear();
		Phone.sendKeys("098765342");

		WebElement register = driver.findElement(By.xpath("//button[@type='submit']"));
		register.click();

		String PhoneError = driver.findElement(By.xpath("//label[@id='txtPhone-error']")).getText();
		String ExpectedPhoneError = "Số điện thoại phải từ 10-11 số.";
		Assert.assertEquals(PhoneError, ExpectedPhoneError);

		sleepInSecond(3);
	}

	@Test
	public void TC_07_RegisterWithInvalidPhoneNumber_2() {

		WebElement Phone = driver.findElement(By.xpath("//input[@id='txtPhone']"));
		Phone.clear();
		Phone.sendKeys("12334567");

		WebElement register = driver.findElement(By.xpath("//button[@type='submit']"));
		register.click();

		String PhoneError = driver.findElement(By.xpath("//label[@id='txtPhone-error']")).getText();
		String ExpectedPhoneError = "Số điện thoại bắt đầu bằng: 09 - 03 - 012 - 016 - 018 - 019 - 088 - 03 - 05 - 07 - 08";
		Assert.assertEquals(PhoneError, ExpectedPhoneError);

		sleepInSecond(3);
	}

	public void sleepInSecond (long timeInSecond) {
		try {
			Thread.sleep(timeInSecond *1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}