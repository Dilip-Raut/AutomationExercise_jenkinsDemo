package com.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.base.TestBase;

public class ProductsPage extends TestBase {

	@FindBy(xpath = "(//div[contains(@class,'productinfo')])/child::h2")
	public List<WebElement> productPrice;

	@FindBy(xpath = "(//div[contains(@class,'productinfo')])/child::p")
	public List<WebElement> productColor;

	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}

	public void getProductPrice() {

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		System.out.println("Quantity to count Product Price - "+productPrice.size());
		for (WebElement price : productPrice) {
			System.out.println(price.getText());
		}
	}

	public void getProductColor() {
		System.out.println("Quantity to count Product Color - "+productColor.size());
		for (WebElement color : productColor) {
			System.out.println(color.getText());
		}
	}
}
