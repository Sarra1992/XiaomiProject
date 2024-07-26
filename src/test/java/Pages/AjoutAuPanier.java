package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutAuPanier {

	@FindBy (xpath="//*[@id=\"product-20748\"]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement verifPtitle;
	@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement btnajoutaupanier;
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div")
	WebElement panier;
	@FindBy (xpath="/html/body/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div/div/div/ul/li/div[2]/a[1]")
	WebElement verifajout;
	
	
	public AjoutAuPanier () {
		
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifproductpage () {
		String actualMessage = verifPtitle.getText();
		return actualMessage ;
		
			}
	
	public void ajoutaupanier () throws Exception {
		
		btnajoutaupanier.click();
		Thread.sleep(5000);
		panier.click();
	}
	
	public String verifpanier () {
		String actualMessage = verifajout.getText();
		return actualMessage ;
		
	}
}
