package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseClass;
import org.utilities.FbPojo;

import io.cucumber.java.en.*;

public class BddStepDefinition extends BaseClass {
	
	@Given("User should launch the chrome browser and load url")
	public void user_should_launch_the_chrome_browser_and_load_url() {
	    launchChrome();
	    loadUrl("https://www.facebook.com/");
	    maxi();
	}

	@When("User should type valid username and invalid password")
	public void user_should_type_valid_username_and_invalid_password() {
		FbPojo f = new FbPojo();
	   fill(f.getTxtUser(), "8778981448");
	   fill(f.getTxtPass(), "jhijolkpk");
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		FbPojo f = new FbPojo();
		clickBtn(f.getBtnlogin());
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.titleContains("Log"));
		}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
	   String title = driver.getTitle();
	   Assert.assertTrue("verify the title", title.contains("Log"));
	   System.out.println("success");
	}



}
