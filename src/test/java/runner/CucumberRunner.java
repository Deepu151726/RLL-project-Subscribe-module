package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Jayadeep\\eclipse-workspace\\RLL-project\\src\\test\\java\\features\\SubscribeDemo.feature",
                  glue= {"steps"},
                  dryRun = false,
                  plugin = {"pretty",
                		  "html:target/cucumber-reports", 
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "timeline:test-output-thread/" })
                  


public class CucumberRunner {


}