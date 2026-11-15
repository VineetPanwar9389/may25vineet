package pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.basetest;

public class Elementspage extends basetest {
	WebDriver driver;
	public Elementspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@data-target=\"#elements\"]")
	private WebElement elementbtn;
	@FindBy(xpath="//a[@href=\"#tab_1\"]")
	private WebElement textbox;
	
	public void clickOnElementTab() {
		clickEle(elementbtn);
	}
	
	public void clickOntextbox() {
		clickEle(textbox);
	}

}
