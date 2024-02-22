package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Module 
{
	public  static WebDriver driver;



@Given("url of site this new file added line added {string}")
public void url_of_site(String url) {
  
		System.setProperty("webdriver.chrome.driver","E:\\Java Project for github practice - Copy\\Parameterised_cucumber2\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@When("user enter username  this is new editing as {string}")
public void user_enter_username_as(String username) {
 
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
}

@When("user enter password as {string}")
public void user_enter_password_as(String password) {
 
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//this is new line added
}
	
@Then("then select profile option")
public void then_select_profile_option() 
{
	System.out.println("select lgout profile option");

}

@Then("click on logout submenu")
public void click_on_logout_submenu() 
{
	System.out.println("select logout and click on it");
}


}
