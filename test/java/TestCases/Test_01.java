package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Excel_DataProvider;
import com.Utility.Library;

import Com_PageObject.LoginPom;

public class Test_01 extends BaseClass {

	@Test
	public void verify_Testlogin_valid() {
		
		LoginPom lgn=PageFactory.initElements(driver,LoginPom.class);
		Library.custom_sendkyes(lgn.getTxt_emailid(),excel.getStringData("Sheet1", 0, 0),"EmailId");
		Library.custom_sendkyes(lgn.getTxt_pass(), excel.getStringData("Sheet1", 0, 1),"Password");
		Library.Custom_click(lgn.getTxt_button(),"LoginButton");
		
		Library.Custom_HandleDropDown(null, null);
		
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
