package utils;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public interface commonutils {
	public void clickEle(WebElement ele);
	public void entervalue(WebElement ele,String value);
	String getdata(String path, String key) throws IOException;

}
