package steps;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.mongodb.MapReduceCommand.OutputType;

import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SubscribePage;
import utilities.XLS_DataProvider;


public class SubscribeDemo {
	
	SubscribePage sp = new SubscribePage(BaseTest.driver);
	
	// static WebDriver driver;
	 //BaseTest bt;
	 //SubscribePage sp;
	 
	//public void Subscribe(BaseTest bt) {
		//this.bt=bt;
	//}
	
	@Given("user is on landing page")
	 public void user_is_on_landing_page() {
	//	  driver = new ChromeDriver();
		//   driver.manage().window().maximize();
		  // sp = PageFactory.initElements(driver,SubscribePage.class);
			//driver.get("https://www.chilternoakfurniture.co.uk/");
			
			String Expected_title = "chiltern oak furniture";
			String Actual_title = "chiltern oak furniture";
			
			Assert.assertEquals(Actual_title, Expected_title);	
		
			 }
	
	@Given("the user is on the subscription page")
	public void the_user_is_on_the_subscription_page() {
		System.out.println("The user is on the subscription page");
		
		
		
	
	}

	@When("the user enters thier {string}")
	public void the_user_enters_thier_email(String email) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		List<Map<String,String>> testdata = XLS_DataProvider.getTestData("sheet1");
		for(Map<String , String>e : testdata) {
			email =String.valueOf(e.get("Email"));	
			sp.enterdata(email);
		 Thread.sleep(3000);
		}
	    
	}

	@When("clicks on the subscribe button")
	public void clicks_on_the_subscribe_button() throws InterruptedException{
	   sp.subscribebtn();
	   
	   Thread.sleep(2000);
		}

	@Then("they should see a confirmation message")
	public void they_should_see_a_confirmation_message() {
		System.out.println("They should see a confirmation message");
		
	    
	}
	

}
		
	
	

		
	

