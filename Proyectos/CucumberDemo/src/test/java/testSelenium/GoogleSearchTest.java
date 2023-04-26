package testSelenium;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
private WebDriver driver;

@Before
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
}

@Test
public void testGoogle() {
	WebElement searchBox=driver.findElement(By.name("q")); // localizando un elemento en la pagina html
	searchBox.clear();
	searchBox.sendKeys("el dolar en argentina");
	searchBox.submit(); // es el ENTER en la textarea
	// tiempo de espera de la busqueda
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	assertEquals("el dolar en argentina - Buscar con Google", driver.getTitle());

}
@After
public void tearDown() {
	driver.quit();
}

}
