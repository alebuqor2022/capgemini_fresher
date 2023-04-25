package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
WebDriver driver;	

  @Given("user is login page")
  public void userIsLoginPage() throws Throwable {
	  System.out.println("estoy en el given");
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
  }

  @When("user enters username and password")
  public void userEnterNamePass() throws Throwable {
	  System.out.println("estoy en el when");
 	  driver.findElement(By.id("email")).sendKeys("qs123@gmail.com");
  	 driver.findElement(By.id("passwd")).sendKeys("qs123");
  }

  @And("clicks on login button")
  public void clickLoginButton() throws Throwable {
	  System.out.println("estoy en el and");
	  driver.findElement(By.id("SubmitLogin")).click();
  }
  
  @Then("user is navigated to the home page")
  public void userNavigatedHomePage() throws Throwable {
	  System.out.println("estoy en el then");
	  System.out.println("exitoso el login");
	  driver.close();
  }



}
