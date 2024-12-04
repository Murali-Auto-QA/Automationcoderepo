package testCases;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.RNCApproval;

public class TCC_004_RNCApprovalTestCase extends BaseClass {
	
	@Test(priority=1)
	void Login()
	{
		LoginPage lg =new LoginPage(driver);
		lg.userEmail(RNCAdmin);
		lg.userPassword(Password);
		lg.loginButton();
		lg.otp(OTP);
		lg.verify();
		
	}
	@Test(priority=2)
	void Approval()
	{

		RNCApproval rn =new RNCApproval(driver);
		rn.nineDot();
		rn.riskandcomplience();
		rn.Pending();
		rn.blutic();
//		rn.profilex_AIGF();
//		rn.profilex();
		rn.ViewMore();
		rn.GSTVerify();
		rn.GstYes();
		rn.NDA();
		rn.NDAVerify();
		rn.NDAYes();
		rn.Statu();
		rn.Approval();
	}
	@Test(priority=3)
	void logout()
	{
		RNCApproval rn =new RNCApproval(driver);
		rn.ClickonProfile();
		rn.logout();
	}
}

