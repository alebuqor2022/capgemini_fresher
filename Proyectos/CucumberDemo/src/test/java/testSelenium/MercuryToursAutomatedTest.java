package testSelenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class MercuryToursAutomatedTest {
	private WebDriver driver;
	// 1er escenario
	// paso1
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator= By.xpath("//img[@src='images/mast_register.gif']");
	
	// paso2
	By usernameLocator = By.id("email");
	By passwordLocator =By.name("password");
	By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");
	// paso3
	By registerBtnLocator = By.name("submit");
	
	// 2do escenario
	// paso 4
	By userLocator = By.name("userName");
	By passLocator=By.name("password");
	By signInBtnLocator= By.name("submit");
	
	// paso5
	By pageLocator=By.tagName("h3");
	
	
	@Before
	public void setUp() throws Exception {
//		System.setProperty("webdriver.msedge.driver", "./src/test/resources/chromedriver/msedgedriver.exe");
//		driver = new EdgeDriver();
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		// para evitar la apertura de la ventana de las cookies
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.switchTo().frame("gdpr-consent-notice");
		WebElement btn = driver.findElement(By.id("save"));
		btn.click();	
		driver.switchTo().parentFrame();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit(); // cerrar el navegador
	}
	
	@Test
	public void registerUser() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);// 2 segundos
		if (driver.findElement(registerPageLocator).isDisplayed()) {
			driver.findElement(usernameLocator).sendKeys("ale");
			driver.findElement(passwordLocator).sendKeys("1234");
			driver.findElement(confirmPasswordLocator).sendKeys("1234");
			driver.findElement(registerBtnLocator).click();
		}else {
			System.out.print("pagina no encontrada");
		}
		java.util.List<WebElement> fonts=driver.findElements(By.tagName("font"));
		
		assertEquals("Note: Your user name is ale.",fonts.get(5).getText()); //0 - 5 = 6 elementos
		
	}
	// 2do ESCENARIO
	@Test
	public void signIn() throws InterruptedException{
		if (driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("ale");
			driver.findElement(passLocator).sendKeys("1234");
			driver.findElement(signInBtnLocator).click();
			Thread.sleep(2000);
			
			assertTrue(driver.findElement(pageLocator).isDisplayed());
		} else {
			System.out.print("el usuario no se encuentra");
		}
		
		
	}

}

