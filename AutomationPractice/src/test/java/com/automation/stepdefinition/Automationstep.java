package com.automation.stepdefinition;



import org.baseclass.Baseclass;
import org.baseclass.Testclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automationstep extends Baseclass {
	
	
	static WebDriver driver;
	static Testclass tc;

	@Given("^User launch the browser$")
	public void user_launch_the_browser() throws Throwable {
	  
		driver = Browser("chrome");
	}

	@When("^User hits the automation practice website$")
	public void user_hits_the_automation_practice_website() throws Throwable {
	    
	    getUrl("http://automationpractice.com/index.php");

	    
	}

	@When("^User click the sign in button$")
	public void user_click_the_sign_in_button() throws Throwable {
	    tc=new Testclass(driver);
	    click(tc.getSignin());

	    
	}

	@When("^User enter the emailaddress$")
	public void user_enter_the_emailaddress() throws Throwable {
		  tc=new Testclass(driver);
		  setText(tc.getUsername(), "testingworld18@gmail.com");

	    
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
	    
		tc=new Testclass(driver);
		  setText(tc.getPassword(), "testingworld18");

	}

	@Then("^user click the signin button$")
	public void user_click_the_signin_button() throws Throwable {
	    
		  tc=new Testclass(driver);
		  click(tc.getSignin());
		

	}

	@Given("^User search the products$")
	public void user_search_the_products() throws Throwable {
	    
		tc=new Testclass(driver);
		  setText(tc.getSearch(), "Dresses");
		  click(tc.getSearch());

	}
	@Given("^User enters Submit$")
	public void user_enters_Submit() throws Throwable {
		tc=new Testclass(driver);
		mouseHover(tc.getSubmit());
		}

	

	
	@Given("^User click the Add TO Cart$")
	public void user_click_the_Add_TO_Cart() throws Throwable {
		  tc=new Testclass(driver);
		  click(tc.getProadd1());

	    
	}

	@Then("^User click the continue shopping button$")
	public void user_click_the_continue_shopping_button() throws Throwable {
	    
		tc=new Testclass(driver);
		  click(tc.getCont1());
	    
	}
	@Then("^User click the Add TO Cart$")
	public void user_click_the_Add_TO_Cart1() throws Throwable {
		  tc=new Testclass(driver);
		  click(tc.getProadd2());
	
	}
	@Then("^User click the continue shopping button1$")
	public void user_click_the_continue_shopping_button1() throws Throwable {
	    
		tc=new Testclass(driver);
		  click(tc.getCont2());
		  
	}
	@Then("^User click the Add TO Cart$")
	public void user_click_the_Add_TO_Cart2() throws Throwable {
		  tc=new Testclass(driver);
		  click(tc.getProadd3());
	
	}
	
	@Given("^User mouse over the cart$")
	public void user_mouse_over_the_cart() throws Throwable {
		 tc=new Testclass(driver);
		 mouseHover(tc.getCart());
	    
	    
	}

	@Given("^User enters the checkout$")
	public void user_enters_the_checkout() throws Throwable {
		 tc=new Testclass(driver);
		 click(tc.getCheckout());

	    
	}

	@Then("^User enters proceed to checkout$")
	public void user_enters_proceed_to_checkout() throws Throwable {
		 tc=new Testclass(driver);
		 click(tc.getProceedtocheck());

	    
	}


}