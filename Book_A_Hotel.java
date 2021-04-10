package com.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	public WebDriver driver;
	 
	@FindBy(id = "hotel_name_dis")
	private WebElement Hotel_Name;
	
	@FindBy(id = "location_dis")
	private WebElement Location;
	
	@FindBy(id = "room_type_dis")
	private WebElement Room_Type;
	
	@FindBy(id = "room_num_dis")
	private WebElement Room_Number;
	
	@FindBy(id = "total_days_dis")
	private WebElement Total_Days;
	
	@FindBy(id = "price_night_dis")
	private WebElement Price_Per_Night;
	
	@FindBy(id="total_price_dis")
	private WebElement Total_Price;
	
	@FindBy(id = "gst_dis")
	private WebElement GST;
	
	@FindBy(id = "final_price_dis")
	private WebElement Final_Price;
	
	@FindBy(id = "first_name")
	private WebElement First_Name;
	
	@FindBy(id = "last_name")
	private WebElement Last_Name;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement Address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement Credit;
	
	@FindBy(id = "cc_type")
	private WebElement Credit_Type;
	
	@FindBy(xpath = "//select[@name= 'cc_exp_month']")
	private WebElement Expiry_Month;
	
	
	@FindBy(id = "cc_exp_year")
	private WebElement Expiry_Year;
	
	@FindBy(id = "cc_cvv")
	private WebElement Creditcard_Number;
	
	@FindBy(id = "book_now")
	private WebElement Book_Btn;

	public Book_A_Hotel(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}

	public WebElement getHotel_Name() {
		return Hotel_Name;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getRoom_Type() {
		return Room_Type;
	}

	public WebElement getRoom_Number() {
		return Room_Number;
	}

	public WebElement getTotal_Days() {
		return Total_Days;
	}

	public WebElement getPrice_Per_Night() {
		return Price_Per_Night;
	}

	public WebElement getTotal_Price() {
		return Total_Price;
	}

	public WebElement getGST() {
		return GST;
	}

	public WebElement getFinal_Price() {
		return Final_Price;
	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getLast_Name() {
		return Last_Name;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCredit() {
		return Credit;
	}

	public WebElement getCredit_Type() {
		return Credit_Type;
	}

	public WebElement getExpiry_Month() {
		return Expiry_Month;
	}

	public WebElement getExpiry_Year() {
		return Expiry_Year;
	}

	public WebElement getCreditcard_Number() {
		return Creditcard_Number;
	}

	public WebElement getBook_Btn() {
		return Book_Btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
