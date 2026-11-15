package baseclass;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.commonutils;
import utils.propertyutils;

public  class basetest implements propertyutils,commonutils {
	
	String configpath="C:\\Users\\nitin\\eclipse-workspace\\seleniumwebdriver\\seleniumframework\\src\\main\\resources\\configdata\\config.properties";
	protected WebDriver driver;
	WebDriverWait wait;
	
	public void setUp(String browser,String env) {
		if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		}if(env.equalsIgnoreCase("qa")) {
			driver.get(getDataFromproperty(configpath,"QAURL"));
		}else if(env.equalsIgnoreCase("uat")) {
			driver.get(getDataFromproperty(configpath,"UATURL"));
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}




private String getDataFromproperty(String configpath2, String string) {
		// TODO Auto-generated method stub
		return null;
	}




public void teardown() {
	driver.quit();
}
	
	@Override
	public void clickEle(WebElement ele) {
	wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	
    } 
	@Override
	public void entervalue(WebElement ele,String value) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		
		
	}




	@Override
	public String getdata(String path, String key) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}








	
	}
	


