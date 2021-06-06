package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement click_button;
	
	public Select_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick_button() {
		return click_button;
	}

	public void setClick_button(WebElement click_button) {
		this.click_button = click_button;
	}

	public WebElement getSelect_btn() {
		return select_btn;
	}

	public void setSelect_btn(WebElement select_btn) {
		this.select_btn = select_btn;
	}

	@FindBy(xpath="//input[@type='submit']")
	private WebElement select_btn;

}
