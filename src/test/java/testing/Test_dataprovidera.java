package testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_dataprovidera {

	@Test(dataProvider="logindata")
	public void login(String uname,String pwd) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/");
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 
	WebElement Title=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]"));
	String expected_title=Title.getText();
	System.out.println(expected_title);
	String actual_title="Swag Labs";
	if(expected_title.equalsIgnoreCase(actual_title)) {
	System.out.println("test case passed");
	}
	else {
	System.out.println("test case failed");
	}
	WebElement username=driver.findElement(By.id("user-name"));
	username.sendKeys(uname);
	Thread.sleep(3000);
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys(pwd);
	Thread.sleep(3000);
	WebElement login=driver.findElement(By.name("login-button"));
	login.click();
	/*
	 * WebElement cart=driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div/div[1]/div[1]/div[3]/a")); if(cart.isEnabled()||
	 * cart.isDisplayed()) { System.out.println("login successful"); } else {
	 * System.out.println("login failed"); }
	 */
	}
	@DataProvider(name="logindata")
	public Object[][] datapass(){
	Object[][] data=new Object[9][2];
	data [0][0]="standard_user";
	data [0][1]="secret_sauce";
	data [1][0]="locked_out_user";
	data [1][1]="secret_sauce";
	data [2][0]="problem_user";
	data [2][1]="secret_sauce";
	data [3][0]="performance_glitch_user";
	data [3][1]="secret_sauce";
	data [4][0]="error_user";
	data [4][1]="secret_sauce";
	data [5][0]="visual_user";
	data [5][1]="secret_sauce";
	data [6][0]="visual_user";
	data [6][1]="abcd";
	data [7][0]="abcd";
	data [7][1]="abcd";
	data [8][0]="abcd";
	data [8][1]="secret_sauce";
	return data;
	}


}
