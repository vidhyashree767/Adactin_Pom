package com.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement Hotels;
	
	@FindBy(id = "room_type")
	private WebElement Room_Type;
	
	@FindBy(id = "room_nos")
	private WebElement Number_Of_Rooms;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement Check_In_Date;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement Check_out_date;
	
	@FindBy(id = "adult_room")
	private WebElement Adult_Per_Room;
	
	@FindBy(id = "child_room")
	private WebElement Children_per_room;
	
	@FindBy(id = "Submit")
	private WebElement Submit;

	public Search_Hotel(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoom_Type() {
		return Room_Type;
	}

	public WebElement getNumber_Of_Rooms() {
		return Number_Of_Rooms;
	}

	public WebElement getCheck_In_Date() {
		return Check_In_Date;
	}

	public WebElement getCheck_out_date() {
		return Check_out_date;
	}

	public WebElement getAdult_Per_Room() {
		return Adult_Per_Room;
	}

	public WebElement getChildren_per_room() {
		return Children_per_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
