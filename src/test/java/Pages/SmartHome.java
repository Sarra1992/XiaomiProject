package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SmartHome {
	
	@FindBy (xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div")
	List<WebElement> productlist;
	
	@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement verifproduct;
	
	public SmartHome () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickonproduct (String pdtName) {
		try {
		for (WebElement pdt: productlist) {
			if (pdt.getText().contains(pdtName)) {
				Config.attente(10);
				pdt.click();
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	
	public String VerifP () {
		String actualMessage = verifproduct.getText();
		return actualMessage ;
		
			}

}
