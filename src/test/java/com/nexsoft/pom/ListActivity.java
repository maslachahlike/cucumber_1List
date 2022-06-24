package com.nexsoft.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ListActivity {

	protected WebDriver driver;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonAddList")
	public WebElement btnplus;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listTitle")
	public WebElement fieldListName;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/moreOptionsCursor")
	public WebElement btnMoreOpt;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validateEditList")
	public WebElement btnCheckNewAg;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/cancelEditList")
	public WebElement btnCancelNewAg;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/addItemEditText")
	public WebElement fieldAddList;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonAddComment")
	public WebElement btnDragComm;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/addCommentEditText")
	public WebElement fieldAddComm;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validate")
	public WebElement btnOkAddList;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.lolo.io.onelist:id/text']")
	public WebElement btnMkn;
	
	
	
	public ListActivity (AndroidDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	
	}
}
