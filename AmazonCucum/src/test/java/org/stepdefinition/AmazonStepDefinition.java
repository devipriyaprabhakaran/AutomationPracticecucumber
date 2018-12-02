package org.stepdefinition;

import org.baseclass.Baseclass;
import org.baseclass.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AmazonStepDefinition extends Baseclass {
	static WebDriver driver;
	static Methods A=new Methods(driver);


@Given("^User launch the browser$")
public void user_launch_the_browser()  {
	Methods A=new Methods(driver);
	getUrl("https://www.google.com/");
   
}
@When("^entering the amazon application$")
public void entering_the_amazon_application() throws Throwable {
	 Methods A=new Methods(driver);
	 getUrl("https://www.amazon.in/");
}

@When("^user mouse over the signin button$")
public void user_mouse_over_the_signin_button() throws Throwable {
	 Methods A=new Methods(driver);
	 mouseHover(A.getYourOrders());
	 click(A.getSigin());
	 
}
private void click(WebElement sigin) {
	// TODO Auto-generated method stub
	
}
@When("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable {
	 Methods A=new Methods(driver);
	 setText(A.getUsername(), "tester@gmail.com");
	 Assert.assertEquals("tester@gmail.com",getAttributeValue(A.getUsername(), "value"));
}

@Then("^clicks the signin button$")
public void clicks_the_signin_button() throws Throwable {
	 Methods A=new Methods(driver);
}


	
	
}
