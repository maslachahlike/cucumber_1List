package com.nexsoft.definitions;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import com.nexsoft.pom.ListActivity;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListDefinition {
	
	protected AndroidDriver driver;
	protected ListActivity listA;
	
	public String screenshoot() {
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String waktu = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String namaFile = "D:\\TestScreenshoot\\" + waktu + ".png";
		File screenshoot = new File(namaFile);

		try {
			FileUtils.copyFile(srcFile, screenshoot);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return namaFile;

	}
	

	@Before
	public void init() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appActivity", "com.lolo.io.onelist.MainActivity");
		capabilities.setCapability("appPackage", "com.lolo.io.onelist");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformVersion", "11");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		listA = new ListActivity(driver);

	}

	
	@Given("User berada pada halaman Main Menu")
	public void user_berada_pada_halaman_main_menu() {
	   
		System.out.println("User berada pada halaman Main Menu");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	
	@When("User click button create new agenda")
	public void user_click_button_create_new_agenda() {
	    System.out.println("User click button create new agenda");
		listA.btnplus.click();
	}

	@And("User input list name {string}")
	public void user_input_list_name(String name) {
	    System.out.println("User input list name");
		listA.fieldListName.sendKeys(name);
	}

	@And("User click button check list to create new agenda")
	public void user_click_button_check_list_to_create_new_agenda() {
	    System.out.println("User click button check list to create new agenda");
		listA.btnCheckNewAg.click();
	}

	@And("User click button Add to create todo list1 {string}")
	public void user_click_button_add_to_create_todo_list1(String list1) {
	    System.out.println("User click button Add to create todo list1");
		listA.fieldAddList.sendKeys(list1);
	}

	@And("user click button check to create new list")
	public void user_click_button_check_to_create_new_list() {
	    System.out.println("User click button check to create new list");
		listA.btnOkAddList.click();
	}

	@And("User click button Add to create todo list2 {string}")
	public void user_click_button_add_to_create_todo_list2(String list2) {
		System.out.println("User click button Add to create todo list2");
		listA.fieldAddList.sendKeys(list2);
	}

	@And("User click button Add to create todo list3 {string}")
	public void user_click_button_add_to_create_todo_list3(String list3) {
		System.out.println("User click button Add to create todo list3");
		listA.fieldAddList.sendKeys(list3);
	}

	@And("User click button Add to create todo list4 {string}")
	public void user_click_button_add_to_create_todo_list4(String list4) {
		System.out.println("User click button Add to create todo list4");
		listA.fieldAddList.sendKeys(list4);
	}

	@And("User click button Add to create todo list5 {string}")
	public void user_click_button_add_to_create_todo_list5(String list5) {
		System.out.println("User click button Add to create todo list5");
		listA.fieldAddList.sendKeys(list5);
	}
		
	@And("User click list1")
	public void user_click_list1() {
	    System.out.println("User click list1");
	
	    
	}
	
	@And("User click list2")
	public void user_click_list2() {
	    System.out.println("User click list2");
	    
	}

	@And("User swipe right list3 to edit it")
	public void user_swipe_right_list3_to_edit_it() {
	    System.out.println("User swipe right list3 to edit it");
	    
	}

	@And("User swipe left list4 to remove it")
	public void user_swipe_left_list4_to_remove_it() {
	    System.out.println("User swipe left list4 to remove it");
	    
	}

	@And("User click list5")
	public void user_click_list5() {
	    System.out.println("User click list5");
	    
	}
	
	@Then("Data saved")
	public void Data_saved() {
		System.out.println("Data saved");
	    List<WebElement> lstElement =driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.lolo.io.onelist:id/text']"));
		
		boolean checkData = false;
		/*
		 * screenshot
		 */
		String file = "<img src = 'file://"+screenshoot()+"'height=\"350\" width=\"700\"/>"; 
		Reporter.log(file);
		for (WebElement webElement : lstElement) {
			String nama = webElement.getText().trim();
			if (nama.equalsIgnoreCase("Mencuci")) {
				checkData = true;
				break;
			}
		}
		assertTrue(checkData);
	
	}
	
	    
	
}
