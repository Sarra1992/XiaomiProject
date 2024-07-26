package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.SmartHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartHomeStepDef {

	@Given("admin accède à la page {string}")
	public void admin_accède_à_la_page(String string) {
	  Config.conChrome();
	  Config.driver = new ChromeDriver ();
	  Config.maxiwindow();
	  Config.driver.get("https://mistore.com.tn/product-category/maison-connectee/");
	  
	}

	@When("admin clique sur {string}")
	public void admin_clique_sur(String pdtName) {
	SmartHome page =new SmartHome();
	page.clickonproduct(pdtName);
		
	}

	@Then("admin est dirigé vers la page {string}")
	public void admin_est_dirigé_vers_la_page(String expectedText) {
		SmartHome page =new SmartHome();
		String actualMessage = page.VerifP();
		Assert.assertEquals(expectedText, actualMessage);
		
	}



}
