package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class pom_object {

	@FindBy(name="firstname")
	public static WebElement username;
	
	@FindBy(id="day")
	public static WebElement day_select;
	
	}
