package stepdefenition;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class implementation {
	static	Properties prop;
	static WebDriver driver;
	
	    @Given("^open chromebrowser$")
	    public void open_chromebrowser() throws Throwable {
	    	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\7-12-20cucumber\\src\\configuration\\objectRepositories.properties");
			 prop=new Properties(); 
			prop.load(fis);      //(load)inbuilt class in java
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			driver = new ChromeDriver();   
	    	
	    }

	    @Given("^navigate the url$")
	    public void navigate_the_url() throws Throwable {
	        
	    	driver.get(prop.getProperty("url"));
	    }

	  /*  @Given("^use anotheracccount$")
	    public void use_anotheracccount() throws Throwable {
	    	WebElement account= driver.findElement(By.xpath(prop.getProperty("useAnotherAccount")));
			account.click();
	    	
	    }*/

	    @When("^enter userName$")
	    public void enter_username() throws Throwable {
	    	WebElement username = driver.findElement(By.xpath(prop.getProperty("userName")));
			username.sendKeys("santhiveeman@gmail.com");
			   }

	    @When("^click the nextbutton$")
	    public void click_the_nextbutton() throws Throwable {
	    	WebElement next= driver.findElement(By.xpath(prop.getProperty("next")));
			next.click();
	    }

	    @When("^enter passWord$")
	    public void enter_password() throws Throwable {
	        
	    	WebElement pwd= driver.findElement(By.xpath(prop.getProperty("passWord")));
			pwd.sendKeys("pepsodent82");
	    }

	    @Then("^loginInbox successfully$")
	    public void logininbox_successfully() throws Throwable {
	       System.out.println("Successfully Login");
	    }


	}


