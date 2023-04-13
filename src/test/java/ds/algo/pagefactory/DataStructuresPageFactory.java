package ds.algo.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructuresPageFactory {
WebDriver driver;

@FindBy(linkText="Get Started")
WebElement dsgetstart;

@FindBy(linkText="Time Complexity")
WebElement dstimecomplex;

@FindBy(linkText="Try here>>>")
WebElement dstryhere;

@FindBy(xpath="//form/div/div/div/textarea")
WebElement dstextarea;

@FindBy(xpath="//button[@type='button']")
WebElement dsrun;

@FindBy(id="output")
WebElement runOutput;


public DataStructuresPageFactory(WebDriver d) {
	this.driver=d;
	PageFactory.initElements(d, this);
}
public void getStartedClick() {
	dsgetstart.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)", "");
	
}
public void timeComplexity() {
	dstimecomplex.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)", "");
}
public void tryHere() {
	dstryhere.click();
	
}

public void textArea() {
	
	dstextarea.sendKeys("print 'Hello World'");
	
}

public void textArea1() {
	
	dstextarea.sendKeys("print hello");
	
}

public void rRun() {
	dsrun.click();
	
}
public void outputValidate() {
	Boolean out  = runOutput.isDisplayed();
	if(out) {
		System.out.println("output is present");
	}
	else {
		System.out.println();
	}
}


}