package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePageXIAOMI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	
	@Given("admin accède à la page d accueil")
	public void admin_accède_à_la_page_d_accueil() {
		 Config.conChrome();
		  Config.driver = new ChromeDriver ();
		  Config.maxiwindow();
		  Config.driver.get("https://mistore.com.tn/");
	}

	@When("admin survule la souris sur le menu {string} et clique sur le sous-menu {string}")
	public void admin_survule_la_souris_sur_le_menu_et_clique_sur_le_sous_menu(String menuName, String submenuName) {
	  HomePageXIAOMI page = new HomePageXIAOMI ();
	  page.mousehoveronmenu(menuName, submenuName);
	}

	

	@Then("admin est dirigé vers la page qui contient le message {string}")
	public void admin_est_dirigé_vers_la_page_qui_contient_le_message(String expectedMessage) {
		HomePageXIAOMI page = new HomePageXIAOMI ();
		String actualMessage = page.verifP();
		Assert.assertEquals(expectedMessage, actualMessage);
	}

}
