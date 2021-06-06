package com.Adactin.stepdef;

import org.openqa.selenium.WebDriver;

import com.Windows.Form_page;
import com.base.Base_Class;
import com.runner.cuc.Runner;

import Com.pom.Login_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {
	public static WebDriver driver = Runner.driver;
	Login_Page login  = new Login_Page(driver);
	Form_page form = new Form_page(driver);
	


	 
	@Given("^user has to Launch Appication$")
	public void user_has_to_Launch_Appication() throws Throwable {
		
		geturl("https://adactinhotelapp.com/");
	}

	@When("^user enters the user name$")
	public void user_enters_the_user_name() throws Throwable {
		
		inputvalueElement(login.getUsername(), "vasanthmsd");
		
	}

	@When("^user enters the password$")
	public void user_enters_the_password() throws Throwable {
		inputvalueElement(login.getPassword(), "UI0S91");
	}

	@Then("^user clicks the login button and navigates to another page$")
	public void user_clicks_the_login_button_and_navigates_to_another_page() throws Throwable {
		ClickonElement(login.getLogin());
	}

	@Given("^user searches the selected room and fills the details$")
	public void user_searches_the_selected_room_and_fills_the_details() throws Throwable {
		
		
	}

	@When("^user searches the location$")
	public void user_searches_the_location() throws Throwable {
		dropdown(form.getLocation(), "byindex", "3");
	}

	@When("^user searches the the hotel$")
	public void user_searches_the_the_hotel() throws Throwable {
		dropdown(form.getHotels(), "byindex", "2");
	}

	@When("^user searches the hotel type$")
	public void user_searches_the_hotel_type() throws Throwable {
		dropdown(form.getRoom_type(), "byindex", "3");
	}

	@When("^user selects no of rooms$")
	public void user_selects_no_of_rooms() throws Throwable {
		dropdown(form.getNo_of_rooms(), "byindex", "4");
	}

	@When("^user checks the checkin date$")
	public void user_checks_the_checkin_date() throws Throwable {
		inputvalueElement(form.getDate(), "22/05/2023");
	}

	@When("^user selects the checkout date$")
	public void user_selects_the_checkout_date() throws Throwable {
		inputvalueElement(form.getOutdate(), "27/06/2025");
	}

	@When("^user chooses adults per room$")
	public void user_chooses_adults_per_room() throws Throwable {
		dropdown(form.getAdultsperroom(), "byindex", "2");
	}

	@When("^user chooses childrens per room$")
	public void user_chooses_childrens_per_room() throws Throwable {
		dropdown(form.getChildroom(), "byindex", "3");
	}

	@Then("^user clicks on search button and navigates to another page$")
	public void user_clicks_on_search_button_and_navigates_to_another_page() throws Throwable {
		
		ClickonElement(form.getSmit());
	}


























}
