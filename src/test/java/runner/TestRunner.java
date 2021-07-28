package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features1",glue = "org.facebook",monochrome = true,dryRun = false,tags = "@Invalid and @Valid",
plugin = {"pretty","json:target/jsonreport.json","html:target/htmlreport.html","junit:target/junitreport.junit"})
public class TestRunner {

}
