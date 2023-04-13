package ds.algo.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import ds.algo.commmon.AlertHandle;
import ds.algo.commmon.BrowserDriverManager;
import ds.algo.pagefactory.ArraysPageFactory;

import ds.algo.pagefactory.HomePageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ArrayPageStepDefinition {

	 WebDriver driver = BrowserDriverManager.driverFactory();
		ArraysPageFactory array = new ArraysPageFactory(driver);
		Logger logger =  LogManager.getLogger();
		HomePageFactory hm = new HomePageFactory(driver);
		
		
	@Given("User is on homepage and clicks on array getstated button")
	public void user_is_on_homepage_and_clicks_on_array_getstated_button() {
		hm.clickArrayBtn();
	  
	}

	@Then("User clicks on arrays in python link")
	public void user_clicks_on_arrays_in_python_link() {
		array.arrayPython();
	}
	@Given("User is on arrays in python page")
	public void user_is_on_arrays_in_python_page() {
	   logger.info("User is on arrys in python page");
	}

	@And("User clicks on try here link")
	public void user_clicks_on_try_here_link() throws InterruptedException {
		Thread.sleep(2000);
	   array.atryHere();
	}

	@Then("User is navigated to text editor page")
	public void user_is_navigated_to_text_editor_page() {
	  array.aTextArea();
	}

	
	@Then("User clicks on run button")
	public void user_clicks_on_run_button() {
	   array.arRun();
	}
	@Given("User is on text editor page of arrays in python")
	public void user_is_on_text_editor_page_of_arrays_in_python() {
	   logger.info("user is on text editor page");
	}

	@Then("User should be navigated to arrays page")
	public void user_should_be_navigated_to_arrays_page() {
	    driver.navigate().to("https://dsportalapp.herokuapp.com/array/");
	}

	@Then("User clicks on Arrays using List link")
	public void user_clicks_on_arrays_using_list_link() {
	   array.arrayList();
	   
	}
     @Given("User is on text editor page of arrays using list")
     public void user_is_on_text_editor_page_of_arrays_using_list() {
    	 logger.info("user is on texr edior page of arrays using list link");
     }
     @Then("User clicks on Basic Operations in lists page")
     public void user_clicks_on_basic_operations_in_lists_page() {
         array.basicOperation();
     }
     @Given("User is on text editor page of Basic Operations in Lists page")
     public void user_is_on_text_editor_page_of_basic_operations_in_lists_page() {
         logger.info("user is on text edior page of basic operations page");
     }

     @Then("User clicks on Applications of Array page")
     public void user_clicks_on_applications_of_array_page() {
        array.appOfArray();
     }
     @Then("User is navigated to text editor page enters invalid input code")
     public void user_is_navigated_to_text_editor_page_enters_invalid_input_code() {
    	 try {
    		 Thread.sleep(1000);
    		 array.aTextArea1();
    	 }
    	 catch (Exception e) {
    		    e.printStackTrace();
    		   
    	}
    
     }
     @Then("User should handle the alert on the page after clicking on run button")
     public void user_should_handle_the_alert_on_the_page_after_clicking_on_run_button() {
    	
    	 AlertHandle.alerthandle();
 		driver.navigate().refresh();
 		driver.navigate().back();
 		
 	}
     }

