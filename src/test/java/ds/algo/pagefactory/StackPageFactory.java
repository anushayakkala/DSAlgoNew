package ds.algo.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPageFactory {
	
	WebDriver driver;
	

	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/a")
	WebElement getstartedBtnStackPage;
	
	@FindBy(linkText="Operations in Stack")
	WebElement operationsinStackLink;
	
	@FindBy(linkText="Implementation")
	WebElement implementationLink;
	
	@FindBy(linkText="Applications")
	WebElement applicationsLink;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryHereBtn;
	
	@FindBy(xpath = "//form/div/div/div/textarea")
	WebElement textArea;
	
	@FindBy(xpath="//button[@onclick='runit()']")
	WebElement runBtn;
	
	@FindBy(id="output")
	WebElement runOutput;
	
//	@FindBy(linkText="Practice Questions")
//	WebElement PractiseQuestionLink;
	
	
	
	public StackPageFactory(WebDriver d) {
		this.driver = d;
		
		PageFactory.initElements(d, this);
	    }
	
	public void clickGetsrtdBtnStackPage() {
		getstartedBtnStackPage.click();
			
	}
	
			 
	public void clickOperationsinStackLink() {
		operationsinStackLink.click();
		
	}

	public void clickImplementationLink() {
		
		implementationLink.click();
		
	}
	

	public void clickApplicationsLink() {
		
		applicationsLink.click();
		
	}
	
    public void tryHereBtnClick() {
    	tryHereBtn.click();
		
	} 
	
	public void textAreaEnterText(String text) {
		textArea.sendKeys(text);
	
	}

    public void runBtnClick() {
		
    	runBtn.click();
	}

    public void outputValidate() {
    	Boolean out  = runOutput.isDisplayed();
    	if(out) {
    		System.out.println("output is present");
    	}
    	else {
    		System.out.println("output is not present");
    	}
    }

}