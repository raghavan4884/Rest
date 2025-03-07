package TestPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature",glue= {"TestPackage"},dryRun=false,plugin= {"pretty"},monochrome=true)
public class TestRunner {

}
