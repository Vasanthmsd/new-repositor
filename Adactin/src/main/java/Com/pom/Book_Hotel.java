package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public void setFirst_name(WebElement first_name) {
		this.first_name = first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public void setLast_name(WebElement last_name) {
		this.last_name = last_name;
	}

	public WebElement getAdress() {
		return adress;
	}

	public void setAdress(WebElement adress) {
		this.adress = adress;
	}

	public WebElement getCredit() {
		return credit;
	}

	public void setCredit(WebElement credit) {
		this.credit = credit;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public void setCardtype(WebElement cardtype) {
		this.cardtype = cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	@FindBy(xpath="//input[@name='first_name']")
	private WebElement first_name;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement adress;
	
	@FindBy(id="cc_num")
	private WebElement credit;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}
	

}
