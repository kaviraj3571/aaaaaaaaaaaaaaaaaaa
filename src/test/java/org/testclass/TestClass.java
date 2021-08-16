package org.testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import adactinWebElements.LoginPage;
import adactinWebElements.SearchHotel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass  {
	WebDriver driver;
	@Given("User on the login page")
	public void user_on_the_login_page() {
		System.out.println("sdfg");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		
	}

	@When("User should login the page by entering {string},{string} and click login button")
	public void user_should_login_the_page_by_entering_and_click_login_button(String username, String password) {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.username.sendKeys(username);
		LoginPage.password.sendKeys(password);
		LoginPage.loginbutton.click();	
	}

	@Then("User fill the fields on Search Hotel page {string},{string} and click the search button")
	public void user_fill_the_fields_on_Search_Hotel_page_and_click_the_search_button(String datepick_in, String datepick_out) {

		
		PageFactory.initElements(driver, SearchHotel.class);
		WebElement location = SearchHotel.location;
		Select select = new Select(location);
		select.selectByIndex(2);
	
		WebElement hotels = SearchHotel.hotels;
		Select select1 = new Select(hotels);
		select1.selectByIndex(3);
		
		WebElement room_type = SearchHotel.room_type;
		Select select2 = new Select(room_type);
		select2.selectByIndex(1);
		
		WebElement room_nos = SearchHotel.room_nos;
		Select select3 = new Select(room_nos);
		select3.selectByIndex(1);
		
		SearchHotel.datepick_in.sendKeys(datepick_in);
		SearchHotel.datepick_out.sendKeys(datepick_out);
		
		WebElement adult_room = SearchHotel.adult_room;
		Select select4 = new Select(adult_room);
		select4.selectByIndex(1);
		
		WebElement child_room = SearchHotel.child_room;
		Select select5 = new Select(child_room);
		select5.selectByIndex(1);
		
		SearchHotel.Submit.click();
		
	}

	@Then("User should click  conform and continue button on Select Hotel")
	public void user_should_click_conform_and_continue_button_on_Select_Hotel() {

	
	
	
	}

	@Then("User fill the Book A Hotel page {string},{string},{string},{string},{string} , {string} , {string} , {string} and click the booknow button")
	public void user_fill_the_Book_A_Hotel_page_and_click_the_booknow_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, io.cucumber.datatable.DataTable dataTable) {

	
	
	
	
	
	}

	@Then("User should get the booking id and click myltinerary button")
	public void user_should_get_the_booking_id_and_click_myltinerary_button() {

	
	
	
	
	}

	@Then("User cancel the booking on Booked Itinerary")
	public void user_cancel_the_booking_on_Booked_Itinerary() {

	
	
	
	
	
	}
	
	
	
	
	
	

}
