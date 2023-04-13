package ds.algo.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePageFactory {
	
	WebDriver driver;
	
	@FindBy(linkText="Implementation of Queue in Python")
	WebElement implementQueueLink;
	
	@FindBy(linkText="Implementation using collections.deque")
	WebElement impUsingCllctnLink;
	
	@FindBy(linkText="Implementation using array")
	WebElement impUsingArrayLink;
	
	@FindBy(linkText="Queue Operations")
	WebElement queueOperations;
	
	public QueuePageFactory(WebDriver d) {
		this.driver = d;
		
		PageFactory.initElements(d, this);
	    }
	
	public void clickImplementQueueLink() {
		implementQueueLink.click();
			
	}
	
	public void clickImpUsingCllctnLink() {
		impUsingCllctnLink.click();
			
	}
	
	public void clickImpUsingArrayLink() {
		impUsingArrayLink.click();
			
	}
	
	
	public void clickQueueOperations() {
		queueOperations.click();
			
	}

}
