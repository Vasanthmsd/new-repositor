package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.implementation.bind.annotation.FieldProxy;

public class Form_page {
	
	
	

	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	


	public Form_page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}

	public WebElement getDate() {
		return date;
	}

	public void setDate(WebElement date) {
		this.date = date;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public void setOutdate(WebElement outdate) {
		this.outdate = outdate;
	}

	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	private WebElement date;
	
	@FindBy(id="datepick_out")
	private WebElement outdate;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room_type;
	
	public WebElement getRoom_type() {
		return room_type;
	}

	public void setRoom_type(WebElement room_type) {
		this.room_type = room_type;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public void setNo_of_rooms(WebElement no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}

	public WebElement getAdultsroom() {
		return adultsroom;
	}

	public void setAdultsroom(WebElement adultsroom) {
		this.adultsroom = adultsroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public void setChildroom(WebElement childroom) {
		this.childroom = childroom;
	}

	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement no_of_rooms;
	
	
	
	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}	
		@FindBy(xpath="//select[@name='adult_room']")
		private WebElement adultsperroom;
		
		public WebElement getAdultsperroom() {
			return adultsperroom;
		}

		public void setAdultsperroom(WebElement adultsperroom) {
			this.adultsperroom = adultsperroom;
		}

		public WebElement getChidrooms() {
			return chidrooms;
		}

		public void setChidrooms(WebElement chidrooms) {
			this.chidrooms = chidrooms;
		}

		@FindBy(xpath="//select[@name='child_room']")
		private WebElement chidrooms;
	



	
	

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultsroom;
	
	public WebElement getAdroom() {
		return adultsroom;
	}

	public void setAdroom(WebElement adroom) {
		this.adultsroom = adroom;
	}

	public WebElement getCroom() {
		return childroom;
	}

	public void setCroom(WebElement croom) {
		this.childroom = croom;
	}

	public WebElement getSmit() {
		return smit;
	}

	public void setSmit(WebElement smit) {
		this.smit = smit;
	}

	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement smit;
	

}
