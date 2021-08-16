package adactinWebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel {
	
	@FindBy(id="first_name")
	public static WebElement firstname;
	
	@FindBy(id="last_name")
	public static WebElement lastname;

	@FindBy(id="address")
	public static WebElement address;
	
	@FindBy(id="cc_num")
	public static WebElement ccnum;
	
	@FindBy(id="cc_type")
	public static WebElement cctype;
	
	
	@FindBy(id="cc_exp_month")
	public static WebElement cc_exp_month;
	
	
	@FindBy(id="cc_exp_year")
	public static WebElement cc_exp_year;
	
	
	@FindBy(id="cc_cvv")
	public static WebElement cc_cvv;
	
	
	@FindBy(id="book_now")
	public static WebElement book_now;
	
	
	
	
	
}
