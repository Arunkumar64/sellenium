package package2;

import org.testng.Assert;
import org.testng.annotations.Test;

import package1.BasePage;
import package1.HomePage;

public class TestPage {

	HomePage Home;
	BasePage bp;

	public TestPage() {
		Home = new HomePage();
		bp = new BasePage();
	}

	@Test
	public void verifytab1() {
		Assert.assertTrue(Home.getWomen().isDisplayed());
		Assert.assertTrue(Home.getDresses().isDisplayed());
		Assert.assertTrue(Home.gettshirts().isDisplayed());
	}

	@Test
	public void verifytab2() {
		Home.clickwomentab();
		Assert.assertTrue(Home.getpageheader().equals("WOMEN"));
		Home.clickdressestab();
		Assert.assertTrue(Home.getpageheader().equals("DRESSES"));
		Home.clicktshirtstab();
		Assert.assertTrue(Home.gettshirtsheader().equals("CATALOG"));
	}

   @Test
	public void verifytab3(){
		Home.clicknewslettertab();
		Home.newslettertab();
		Home.submitbutton();
		Assert.assertTrue(Home.getnewsalert().equals("  Newsletter : You have successfully subscribed to this newsletter."));
		
}

}
