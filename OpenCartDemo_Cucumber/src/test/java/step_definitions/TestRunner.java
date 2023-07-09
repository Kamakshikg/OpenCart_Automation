package step_definitions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\test\\resources\\Features"},glue={"step_definitions"},plugin={"pretty","html:target/HTMLReport"})
public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
