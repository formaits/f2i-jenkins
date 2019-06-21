package com.formation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.formation.pages.HomePage;
import com.formation.pages.ProductsPage;

public class StoreTest {

	private WebDriver driver;

	@BeforeEach
	void setup() {
		driver = new ChromeDriver();
	}

	@AfterEach
	void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	
	  @Test
	  public void verifyProductsPageInformation() {
	    HomePage homePage = new HomePage(driver);
	    homePage.open();
	    ProductsPage productsPage = homePage.goToProducts();

	    // Verify results in products page
	    String expectedProductsMainInfo = "Here's the stuff we sell";
	    assertEquals(productsPage.getMainInfo(), expectedProductsMainInfo, "Product page main info was not the expected one.");
	    String expectedProductsSecondaryInfo = "We have everything... everything";
	    assertEquals(productsPage.getSecondaryInfo(), expectedProductsSecondaryInfo, "Product page secondary info was not the expected one.");
	  }

	  @Test
	  public void verifyHomePageInformation() {
	    HomePage homePage = new HomePage(driver);
	    homePage.open();

	    String expectedHomePageMainInfo = "Our best selling product";
	    assertEquals(homePage.getMainInfo(), expectedHomePageMainInfo, "Home page main info was not the expected one.");
	    String expectedHomePageSecondaryInfo = "Buy it before it's too late";
	    assertEquals(homePage.getSecondaryInfo(), expectedHomePageSecondaryInfo, "Home page secondary info was not the expected one.");
	  }
	

}
