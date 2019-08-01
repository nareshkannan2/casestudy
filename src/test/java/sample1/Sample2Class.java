package sample1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample2Class {
	WebDriver driver;

	@Given("user opens Demotours in chrome browser")
	public void user_opens_Demotours_in_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Seldrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("enter the username as {string} and password as {string}")
	public void enter_the_username_as_and_password_as(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@When("click the signin button")
	public void click_the_signin_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("verify the login is success")
	public void verify_the_login_is_success() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		driver.close();
	}

}
