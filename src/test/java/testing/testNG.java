package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {


	@Test(priority=0)
	 public void header() {
		  System.out.println("test1");
	 }
	  @Test(priority=1)
	 public void footer() {
		  System.out.println("test2");
	 }
	  
	  
	  
		/*
		 * @BeforeMethod public void beforeMethod() {
		 * 
		 * System.out.println("scenario started"); }
		 * 
		 * @AfterMethod public void afterMethod() {
		 * 
		 * System.out.println("scenario completed"); }
		 * 
		 * @BeforeClass public void beforeClass() {
		 * 
		 * System.out.println("before class"); }
		 * 
		 * @AfterClass public void afterClass() { System.out.println("after class"); }
		 * 
		 * @BeforeTest public void beforeTest() {
		 * 
		 * System.out.println("before test"); }
		 * 
		 * @AfterTest public void afterTest() { System.out.print(" after test"); }
		 * 
		 * @BeforeSuite public void beforeSuite() {
		 * 
		 * System.out.println("before suite"); }
		 * 
		 * @AfterSuite public void afterSuite() {
		 * 
		 * System.out.println("after suite"); }
		 */


	

}
