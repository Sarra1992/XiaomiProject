package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.AjoutAuPanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutaupanierStepDef {

	
	@Given("admin accède à la page du produit à ajouter")
	public void admin_accède_à_la_page_du_produit_à_ajouter() {
		Config.conChrome();
		  Config.driver = new ChromeDriver ();
		  Config.maxiwindow();
		  Config.driver.get("https://mistore.com.tn/product/mi-temperature-and-humidity-monitor-pro/");
	}

	@When("admin clique sur le bouton {string} et clique sur le panier")
	public void admin_clique_sur_le_bouton_et_clique_sur_le_panier(String string) throws Exception {
		AjoutAuPanier page = new AjoutAuPanier ();
		page.verifproductpage();
		page.ajoutaupanier();
	}

	@Then("le produit {string} est ajouté au panier")
	public void le_produit_est_ajouté_au_panier(String string) {
		AjoutAuPanier page = new AjoutAuPanier ();
		page.verifpanier();
	
	}
}
