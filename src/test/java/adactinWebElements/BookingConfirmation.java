package adactinWebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmation {
	
	@FindBy(id="order_no")
	public static WebElement order_no;
	

	@FindBy(id="search_hotel")
	public static WebElement search_hotelbutton;
	
	
	@FindBy(id="my_itinerary")
	public static WebElement my_itinerarybutton;
	
	@FindBy(id="logout")
	public static WebElement logout;
	
	
	
}
