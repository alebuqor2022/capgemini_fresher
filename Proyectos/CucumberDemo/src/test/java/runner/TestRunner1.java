package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/search.feature",
		glue= "true"				
		)
public class TestRunner1 extends AbstractTestNGCucumberTests{

}
