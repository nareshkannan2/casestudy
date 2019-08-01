package sample1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cslogin {
	WebDriver driver;

	@Given("user opens the testmeapp on chrome browser")
	public void user_opens_the_testmeapp_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Seldrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@Then("user enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("click on SignIn Button")
	public void click_on_SignIn_Button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("verify the login as Successful")
	public void verify_the_login_as_Successful() {
		Assert.assertTrue(driver.getTitle().contains("Home"));
		driver.close();
	}

}
