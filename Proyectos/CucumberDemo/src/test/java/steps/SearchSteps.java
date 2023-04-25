package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;

public class SearchSteps {
WebDriver driver;

  @Given("the user is in the index page")
  public void userIsInIndexPage() {
	  System.out.println("estoy en el given");
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("http://automationpractice.com/index.php");
	  System.out.println("estoy en index page");
  }

  @When("the user enters dresses in the search bar")
  public void userEnterDressesInSearchBar() throws Throwable {
	  driver.findElement(By.id("search_query_top")).sendKeys("dresses");
	  System.out.println("estoy tipeando dresses");
  }

  @And("the user clicks the search button")
  public void userClicksSearchButton() throws Throwable {
	  driver.findElement(By.name("submit_search")).click();
	  System.out.println("estoy haciendo click en buscar");
	 
  }
  @Then("the dresses page appears")
  public void dressesPageAppear() {
	  System.out.println("comparo con el assert para dresses");
	  String titulo=driver.findElement(By.className("lighter")).getText();
	  Assert.assertEquals("\"DRESSES\"", titulo);
	  driver.close();
  }
}
