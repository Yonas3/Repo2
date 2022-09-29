package RunnerOptions;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




//@RunWith(Cucumber.class)     // to run specific class mention the class name ex .Features.Login.feature
@CucumberOptions(features="src\\main\\resources\\Features", glue= {"stepsDefinitions"}, 
monochrome=true,
plugin= {"pretty", 
"json:target/JSONReport/login.json",
"html:target/HtmlReport"}) 

public class TestRunner extends AbstractTestNGCucumberTests { 
	// proved both feature files and step definitions
}
