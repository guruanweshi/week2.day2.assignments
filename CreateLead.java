package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup(); //driver setup for Firefox Browser
		FirefoxDriver driver = new FirefoxDriver(); // create object for Firefox driver
		driver.manage().window().maximize(); // maximize the browser
		
		driver.get("http://leaftaps.com./opentaps/control/main"); // open th target URL in the browser
		
		WebElement usernameElement = driver.findElement(By.id("username")); // find username element by id attribute
		usernameElement.sendKeys("Demosalesmanager"); // populate username Demosalesmanager int he username field
		
		WebElement passwordElement = driver.findElement(By.id("password")); // find password element by id attribute
		passwordElement.sendKeys("crmsfa"); // Enter the password crmsfa in the password field
		
		WebElement loginElement = driver.findElement(By.className("decorativeSubmit")); //find login button element using class name
		loginElement.click(); // click the login button
		
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA")); // find crmsfa element link by linktext attribute
		crmsfaElement.click(); // click on the crm/sfa link
		
		WebElement leadsElement = driver.findElement(By.linkText("Leads")); // find Leads button element link by linktext attribute
		leadsElement.click(); // click on Leads button
		
		WebElement createleadsElement = driver.findElement(By.linkText("Create Lead")); // find createLead button element link by linktext attribute
		createleadsElement.click(); // click on createLead button
		
		WebElement companynameElement = driver.findElement(By.id("createLeadForm_companyName")); //find company name element by id attribute
		companynameElement.sendKeys("Illuminati"); // populate the company name filed
		
		WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName")); // find firstname element by id attribute
		firstnameElement.sendKeys("Captain"); // populate first name field
		
		WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName")); // find last name element by id attribute
		lastnameElement.sendKeys("America"); // populate last name field
		

		WebElement firstnamelocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal")); // find first name local element by id attribute
		firstnamelocalElement.sendKeys("I am local"); // populate first name local field
		
		WebElement departmentElement = driver.findElement(By.name("departmentName")); // find Department element by name attribute
		departmentElement.sendKeys("Astro Physics"); // populate Department field
		
		WebElement descriptionElement = driver.findElement(By.name("description")); // find description element by  name attribute
	    descriptionElement.sendKeys("I dont know what to write here"); // populate the description field
		
		WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail")); // find email element by name attribute
		emailElement.sendKeys("anonymous@gmail.com"); // populate email field
		
		//find drop down element state/province using id attribute
		WebElement stateprovinceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(stateprovinceElement);  // create an object dd1 for state/province dropdown
		dd1.selectByVisibleText("New York"); // access method select by visible text from dd1 object and set to New york
		
		WebElement createleadElement = driver.findElement(By.className("smallSubmit")); // find element create lead button by class name
		createleadElement.click(); // perform click action on create lead button
		
		System.out.println("The Page Title is : "+ driver.getTitle()); // get the title of the page
		
		
		
	}

}

