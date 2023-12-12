package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="C:\\Users\\Jayadeep\\eclipse-workspace\\RLL-project\\src\\test\\java\\features\\SubscribeDemo.feature",
                  glue= {"steps"},
                  dryRun = false,
                  plugin = {"pretty",
                		  "html:target/cucumber-reports", 
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "timeline:test-output-thread/" })
                  


public class testrunner extends AbstractTestNGCucumberTests {


}
