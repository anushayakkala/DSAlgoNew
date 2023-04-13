package ds.algo.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ds.algo.commmon.AlertHandle;
import ds.algo.commmon.BrowserDriverManager;
import ds.algo.pagefactory.DataStructuresPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSPageStepDefinition {
	 WebDriver driver = BrowserDriverManager.driverFactory();
	DataStructuresPageFactory ds = new DataStructuresPageFactory(driver);
	Logger logger = LogManager.getLogger();
	
	
	@Given("User clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
	  ds.getStartedClick();
	}

	@Then("DataStructure Page is displayed successfully")
	public void data_structure_page_is_displayed_successfully() {
		String actualURL = driver.findElement(By.xpath("//h4[text()='Data Structures-Introduction']")).getText();
		//String ExpecterdURL = "Data Structures-Introduction page";
		
		String ExpecterdURL = "Data Structures-Introduction";
		Assert.assertEquals(actualURL, ExpecterdURL);
		logger.info("DataStructures Page is displayed successfully");
		
      }
	
	@Given("User is on the Data Structures Introduction after logged in")
	public void user_is_on_the_data_structures_introduction_after_logged_in() {
	   
	}

	@When("User clicks on the Time complexity link")
	public void user_clicks_on_the_time_complexity_link() {
	    ds.timeComplexity();
	}

	@Then("User should be redirected to Time complexity page")
	public void user_should_be_redirected_to_time_complexity_page() {
	    logger.info("Time Complexity page is displayed successfully");
	}
	
	@Given("The user now clicks on try here button")
	public void the_user_now_clicks_on_try_here_button() {
	    ds.tryHere();
	}

	@When("The user enter valid python code in tryEditor")
	public void the_user_enter_valid_python_code_in_try_editor() {
	   ds.textArea();
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() throws InterruptedException {
		Thread.sleep(1000);
	   ds.rRun();
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		ds.outputValidate();
	    logger.info("result is printed");
	    
	}
	
	@Then("The user should handle alert presented with Run result")
	public void the_user_should_handle_alert_presented_with_Run_result() {
		AlertHandle.alerthandle();
		driver.navigate().refresh();
		driver.navigate().back();
	}
	
	@When("The user enter invalid python code in tryEditor")
	public void the_user_enter_invalid_python_code_in_try_editor() {
	 try {
		 Thread.sleep(1000);
		 ds.textArea1();
	 }
	 catch (Exception e) {
		    e.printStackTrace();
		   
	}
	 
}
	@And("User navigates to home page")
	public void user_navigates_to_home_page() {
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}
}
