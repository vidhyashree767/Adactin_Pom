package com.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Button {
public WebDriver driver;

@FindBy(xpath="//input[@type='radio']")
private WebElement Radio_Btn;

@FindBy(xpath = "//input[@type='submit']")
private WebElement continuee;

public Check_Button(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

public WebElement getRadio_Btn() {
	return Radio_Btn;
}

public WebElement getContinuee() {
	return continuee;
}


}
