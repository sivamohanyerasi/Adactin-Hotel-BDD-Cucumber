package com.orangehrm.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangehrm.exceptions.FrameworkException;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	WebDriver driver;
	
	@After
	public void teardown() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@Before
	public void setUp()
	{
		System.out.println("In Before hook..");
	}
	
	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {
		
		switch (browserName.toLowerCase())
		{
		case "chrome":  driver=new ChromeDriver();
				break;
				
		case "firefox":  driver=new FirefoxDriver();
		break;
		
		case "edge":  driver=new EdgeDriver();
		break;
				
		default:
			throw new FrameworkException("Invalid browser given " + browserName.toLowerCase());
		}
	    
		
	}

	@Given("user launch app using url {string}")
	public void user_launch_app_using_url(String url) {
		
		//app launch 
		driver.get(url);
		driver.manage().window().maximize();
	   
	}

	@When("user enters text {string} in textbox using xpath {string}")
	public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
	  
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	@When("user clicks button using xpath {string}")
	public void user_clicks_button_using_xpath(String xpath) {
	   
		driver.findElement(By.xpath(xpath)).click();
	}

	@Then("user validates title to be {string}")
	public void user_validates_title_to_be(String expTitle) {
	 
		Assert.assertTrue(driver.getTitle().equals(expTitle));
	}

	

@When("user clicks link using xpath {string}")
public void user_clicks_link_using_xpath(String xpath) {
   
	driver.findElement(By.xpath(xpath)).click();
}

@When("user enters details in Registration form")
public void user_enters_details_in_registration_form(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    
	List<List<String>> allList=dataTable.asLists();
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(allList.get(0).get(0));
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(allList.get(0).get(1));
	driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(allList.get(0).get(2));
	driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(allList.get(0).get(3));
	driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(allList.get(0).get(4));
	driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(allList.get(0).get(5));
	
}


	
}
