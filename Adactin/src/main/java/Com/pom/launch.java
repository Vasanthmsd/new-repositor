package Com.pom;

import org.openqa.selenium.interactions.SendKeysAction;

import com.Windows.Login_Page;
import com.base.Base_Class;

public class launch extends Base_Class {
	
	public static void main(String[] args) throws Throwable {
		
		driver = getdriver("chrome");
		geturl("https://adactinhotelapp.com/");
		
		sleep(3000);
		
		Login_Page log = new Login_Page(driver);
		inputvalueElement(log.getUsername(), "vasanthmsd");
		inputvalueElement(log.getPassword(), "UI0S91");
		ClickonElement(log.getLogin());
		
		Form_page page = new Form_page(driver);
		dropdown(page.getLocation(), "byindex", "2");
		dropdown(page.getHotels(), "byindex", "2");
		dropdown(page.getRoom_type(), "byindex", "3");
		dropdown(page.getNo_of_rooms(), "byindex", "3");
		sleep(3000);
		inputvalueElement(page.getDate(), "01/05/2025");
		inputvalueElement(page.getOutdate(), "01/10/2025");
		
		sleep(3000);
		dropdown(page.getAdultsperroom(), "byindex", "3");
		dropdown(page.getChidrooms(), "byindex", "3");
		ClickonElement(page.getSmit());
		
		
		Select_Hotel select = new Select_Hotel(driver);
		ClickonElement(select.getClick_button());
		ClickonElement(select.getSelect_btn());
		
		Book_Hotel book = new Book_Hotel(driver);
		inputvalueElement(book.getFirst_name(), "vasanth");
		inputvalueElement(book.getLast_name(), "kumar");
		inputvalueElement(book.getAdress(), "dubai");
		inputvalueElement(book.getCredit(), "1236547896523145");
		dropdown(book.getCardtype(), "byindex", "1");
		dropdown(book.getMonth(), "byindex", "3");
		dropdown(book.getYear(), "byvisibletext", "2014");
		inputvalueElement(book.getCvv(), "258");
		ClickonElement(book.getSearch());
		
		
		
		Booking_Conformation booki = new Booking_Conformation(driver);
		actionsmethod(booki.getDrivermove(), "move");
				ClickonElement(booki.getBtn());
		
		
	}
	
	

}
