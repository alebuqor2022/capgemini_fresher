package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;

public class SearchGenericSteps {
WebDriver driver;

@Given("the user is in the index page")
public void userIsInIndexPage() {
	  System.out.println("estoy en el given");
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("http://automationpractice.com/index.php");
	  System.out.println("estoy en index page");
}

  @When("the user enters (.*) in the search bar")
  public void userEnterDressesInSearchBar(String article)  {
	  driver.findElement(By.id("search_query_top")).sendKeys(article);
	  System.out.println("estoy tipeando " + article);
  }

  @And("the user clicks the search button")
  public void userClicksSearchButton() throws Throwable {
	  driver.findElement(By.name("submit_search")).click();
	  System.out.println("estoy haciendo click en buscar");
  }
  
  @Then("the (.*) page appears")
  public void dressesPageAppear(String article) throws Throwable {
	  String titulo=driver.findElement(By.className("lighter")).getText();
	  Assert.assertEquals("\""+ article.toUpperCase() +"\"", titulo);
	  driver.close();
  }

 

}
