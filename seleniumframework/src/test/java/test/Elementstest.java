package test;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseclass.basetest;
import pomrepo.Elementspage;


public class Elementstest extends basetest {
	Elementspage ep;
	@Parameters({"browser","env"})
	@BeforeClass
	public void initialize(String browser,String env) 
	{
		setUp(browser,env);
		ep= new Elementspage(driver);
	}
	
	
@Test
public void validatetextbox() {
	ep.clickOnElementTab();
	ep.clickOntextbox();
  }
}
