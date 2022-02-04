package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features", glue = {
		"ScenarioDefinitions" }, monochrome = true, plugin = { "pretty", "junit: target/JunitReports/reports.xml",
				"json: target/JsonReports/reports.json", "html: target/HtmlReports/reports.html" },
		tags = "@priority2" // This will run the GuruDemoSiteLogin.featuree where we set the priority as 2
							//or we can mention the feature file name in 'features' under @CucumberOptions
							//This is an example of BDD with POM design pattern.
)

public class LoginWithPOM {

}
