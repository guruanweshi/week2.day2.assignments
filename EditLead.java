package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
	
		WebDriverManager.edgedriver().setup(); //driver setup for Edge Browser
		EdgeDriver driver = new EdgeDriver(); // create object for Edge driver
		driver.manage().window().maximize(); // maximize the browser
		
		driver.get("http://leaftaps.com./opentaps/control/main"); // open the target URL in the browser
		
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
		
	    WebElement descriptionElement = driver.findElement(By.name("description")); // find description element by attribute name
	    descriptionElement.sendKeys("I dont know what to write here"); // populate the description field
	    
	    WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail")); // find email element by name attribute
		emailElement.sendKeys("anonymous@gmail.com"); // populate email field
		
		//find drop down element state/province using id attribute
		WebElement stateprovinceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(stateprovinceElement);  // create an object dd1 for state/province dropdown
		dd1.selectByVisibleText("New York"); // access method select by visible text from dd1 object and set to New york
		
		WebElement createleadElement = driver.findElement(By.className("smallSubmit")); // find element create lead button by class name
		createleadElement.click(); // perform click action on create lead button
		
		WebElement editElement = driver.findElement(By.linkText("Edit")); // find edit element by attribute linktext
		editElement.click();   // click the edit button
		
		WebElement updatedescriptionElelement = driver.findElement(By.id("updateLeadForm_description"));
		updatedescriptionElelement.clear(); // clear description field
		
		WebElement importantnoteElement = driver.findElement(By.name("importantNote")); // find important note element by id name
	    importantnoteElement.sendKeys("Once again I am clueless"); // populate important note field
	  
		WebElement updateElement = driver.findElement(By.className("smallSubmit")); // find element update button by attribute class name
		updateElement.click(); // perform click action on update button
		
		System.out.println("The Page Title is : "+ driver.getTitle()); // get the title of the page
		
		
	}

}
