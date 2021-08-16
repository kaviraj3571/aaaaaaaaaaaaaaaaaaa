package adactinWebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookedItinerary {
	

	@FindBy(id="order_id_text")
	public static WebElement order_id_text;
	
	@FindBy(id="search_hotel_id")
	public static WebElement search_hotel_id;
	
	@FindBy(name="cancelall")
	public static WebElement cancelall;

	@FindBy(id="search_hotel")
	public static WebElement search_hotel;

	@FindBy(id="logout")
	public static WebElement logout;

	
	
	
}
