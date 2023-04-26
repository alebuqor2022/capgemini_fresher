package testSelenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class Localizadores {
@Test
	void localizadores() {
		By locator=By.id("id_del_elemento");
		By locator_name = By.name("name_element");
		By locator_className = By.className("clase_elemento");
		By locator_tagName = By.tagName("tag");
		By locator_linkText = By.linkText("texto_link");
		By locator_partialLinkText = By.partialLinkText("textoPartial_link");
		By locator_cssSelector=By.cssSelector("input[name='q']");
		By locator_Xpath = By.xpath("//input[@name='q']");
	}
}
