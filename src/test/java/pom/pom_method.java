package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class pom_method {
	static WebDriver driver;
	@Test
	public static void openbrowser() {
		
		 driver = new ChromeDriver();
			driver.get("https://www.facebook.com/reg/");
	}
	public static void main(String[] args) {
	
	
	PageFactory.initElements(driver,pom_object.class);
	
	pom_method.openbrowser();
	pom_method.user();
	pom_method.selectt();
	
	 
}
	@Test
	public static void user() {
		PageFactory.initElements(driver,pom_object.class);
		pom_object.username.sendKeys("abd");
	}
	
	@Test
	public static void selectt() {
		PageFactory.initElements(driver,pom_object.class);
		Select day_select = new Select(pom_object.day_select);
		 day_select.selectByValue("13");
	}
}