package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseClass 
{
	public  static WebDriver driver;
	
	@Given("url of page {string}")
	public void url_of_page(String url) 
	{

		System.setProperty("webdriver.chrome.driver","E:\\Java Project for github practice\\Parameterised_cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("user enter username {string}")
	public void user_enter_username(String username) {
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	}

	@When("user enter password {string}")
	public void user_enter_password(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@Then("user login successfully")
	public void user_login_successfully() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
