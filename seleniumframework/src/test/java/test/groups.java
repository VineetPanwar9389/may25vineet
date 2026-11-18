package test;

import org.testng.annotations.Test;

public class groups {
	@Test(groups= {"regression and sanity"})
	public void first() {
		System.out.println("regression and sanity");
		
	}
	@Test(groups= {"sanity"})
	public void second() {
		System.out.println("sanity");
	}
	@Test(groups= {"regression"})
	public void third() {
		System.out.println("regression");
	}
	

}
