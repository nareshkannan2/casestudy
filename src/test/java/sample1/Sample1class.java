package sample1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample1class {
	WebDriver driver;

	@Given("user opens newtours application on chrome browser")
	public void user_opens_newtours_application_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Seldrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("enter username as mercury and password field")
	public void enter_username_as_mercury_and_password_field() {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@When("Click on signin button")
	public void click_on_signin_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("verify login result as success")
	public void verify_login_result_as_success() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		driver.close();
	}

	@When("enter username as {string} and password field")
	public void enter_username_as_and_password_field(String credentials) {
		driver.findElement(By.name("userName")).sendKeys(credentials);
		driver.findElement(By.name("password")).sendKeys(credentials);
	}

}
