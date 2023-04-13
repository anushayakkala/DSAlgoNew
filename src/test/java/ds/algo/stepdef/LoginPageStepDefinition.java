package ds.algo.stepdef;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import ds.algo.commmon.BrowserDriverManager;
import ds.algo.pagefactory.LoginPageFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ds.algo.commmon.ExcelSheetReader;

public class LoginPageStepDefinition {

	WebDriver driver = BrowserDriverManager.driverFactory();

	LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
	
	ExcelSheetReader excelSheetReader = new ExcelSheetReader();

	Logger logger = LogManager.getLogger();

	@Given("User enter {string} and {string}")
	public void user_enter_and(String uname, String pass) throws InterruptedException {
		// driver.get("https://dsportalapp.herokuapp.com/login");
		loginPageFactory.enterUser(uname);
		Thread.sleep(1000);
		loginPageFactory.enterPass(pass);

	}

//    @Given("User click on login button")
//    public void user_click_on_login_button() {
//    	loginPageFactory.loginClick();
//    }

@Then("Invalid credentials message is displayed")
public void invalid_credentials_message_is_displayed() {
	String errMsg = driver.findElement(By.xpath("//*[@role='alert']")).getText();
	logger.error(errMsg);
	Assert.assertEquals(errMsg, "Invalid Username and Password");
}
	

	@Given("User click on login button")
	public void user_click_on_login_button() {
		loginPageFactory.loginClick();
	}

	@Then("Success message {string} is displayed")
	public void success_message_is_displayed(String string) {
		loginPageFactory.successmsg();
	}

	@Then("User is signed out successfully")
	public void user_is_signed_out_successfully() {
		logger.info("Logged out successfully");
	}

	@Given("User enter the below details")
	public void user_enter_the_below_details(DataTable dataTable) throws InterruptedException {
		List<List<String>> userList = dataTable.asLists(String.class);
		
		for (List<String> e : userList) {
			String user1 = e.get(0);
			System.out.println("This is username: "+user1);
			loginPageFactory.enterUser(user1);

			String pass1 = e.get(1);
			System.out.println("This is password: " +pass1);
			loginPageFactory.enterPass(pass1);
			
			Thread.sleep(1000);
			
			loginPageFactory.loginClick();

		}

	}

	@Then("User is not logged in")
	public void user_is_not_logged_in() {
		logger.error("User is not logged in");
	}
	
	@Given("User enter the username and password from excel sheet")
	public void user_enter_the_username_and_password_from_excel_sheet() throws IOException, InterruptedException {
		List<List<String>> excelList = excelSheetReader.readExcelData();
		
		for (List<String> elist : excelList) {
			
			String user1 = elist.get(0);
			System.out.println("This is username: "+user1);
			loginPageFactory.enterUser(user1);

			String pass1 = elist.get(1);
			System.out.println("This is password: " +pass1);
			loginPageFactory.enterPass(pass1);
			
			Thread.sleep(1000);
			
			loginPageFactory.loginClick();

			
		}
		
		
	}

}