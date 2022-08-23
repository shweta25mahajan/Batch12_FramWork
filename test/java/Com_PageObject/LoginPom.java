package Com_PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

	@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement txt_emailid;
	@FindBy(how=How.XPATH,using="//input[@name='pass']") private WebElement txt_pass;
	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']") private WebElement txt_button;
	
	public WebElement getTxt_emailid() {
		return txt_emailid;
	}
	
	public WebElement getTxt_pass() {
		return txt_pass;
	}
	
	public WebElement getTxt_button() {
		return txt_button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
