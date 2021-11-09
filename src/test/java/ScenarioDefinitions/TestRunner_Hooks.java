package ScenarioDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"ScenarioDefinitions"}, 
monochrome=true,
plugin= {"pretty","junit: target/JunitReports/reports.xml",
		"json: target/JsonReports/reports.json",
		"html: target/HtmlReports/reports.html" },
tags= "@HookScenario"

//tags= "@priority1 and @priority2" // it will execute scenarios which has both tags

		)
public class TestRunner_Hooks {

}
