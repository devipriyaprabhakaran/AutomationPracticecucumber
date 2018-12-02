package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Methods {
	static WebDriver driver;
	public Methods(WebDriver IDdriver) {
	Methods.driver	=IDdriver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='nav-link-yourAccount']")
	private WebElement yourOrders;
	@FindBy(xpath="//span[@class='nav-action-inner'][1]")
	private WebElement Sigin;
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement enter;
	public WebElement getYourOrders() {
		return yourOrders;
	}
	public WebElement getSigin() {
		return Sigin;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getEnter() {
		return enter;
	}
	
	
}
