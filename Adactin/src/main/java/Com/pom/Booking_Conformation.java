package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Conformation {
		
	
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement btn;
	
	@FindBy(id="search_hotel")
	private WebElement drivermove;

	public WebElement getDrivermove() {
		return drivermove;
	}

	public void setDrivermove(WebElement drivermove) {
		this.drivermove = drivermove;
	}

	public Booking_Conformation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn() {
		return btn;
	}

	public void setBtn(WebElement btn) {
		this.btn = btn;
	}

}
