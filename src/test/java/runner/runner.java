package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@CucumberOptions(features="./src/test/java/featurefiles",glue = {"stepDefination"}, dryRun=false, tags= {"@smokeTest","@End2End"})
public class runner extends AbstractTestNGCucumberTests {
	
}
