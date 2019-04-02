package package1;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(xpath = "//*[@id='block_top_menu']//*[text()='Women']")
	private WebElement women;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]//*[text()='Dresses']")
	private WebElement dresses;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul//li[3]//*[text()='T-shirts']")
	private WebElement tshirts;

	//@FindBy(xpath = "//*[@id=\"layered_form\"]/div/div[1]//*[text()='Categories']")
	//private WebElement categories;
	
	@FindBy(xpath="//*[@id='categories_block_left']/h2")
	private WebElement pageheader;

	@FindBy(xpath = "//*[@class='row']//*[@id='layered_block_left']/p")
	private WebElement tshirtsheader;

	@FindBy(id="newsletter-input")
	private WebElement newsletter;

	@FindBy(xpath = "//*[@id='newsletter_block_left']/div/form/div/button")
	private WebElement submitbutton;

	@FindBy(xpath = "//*[@id='columns']//p[@class='alert alert-success']")
	private WebElement alert;

	@FindBy(xpath = "//*[@id='columns']/p[@class='alert alert-danger']")
	private WebElement dangeralert;


	public  HomePage() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomen() {
		return women;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement gettshirts() {
		return tshirts;
	}

    public String gettshirtsheader() {
		return tshirtsheader.getText();

	}
	public String getpageheader() {
		return pageheader.getText();
	}

	public void clickwomentab() {
		women.click();
	}

	public void clickdressestab() {
		dresses.click();
	}

	public void clicktshirtstab() {
		tshirts.click();
	}

	public void newslettertab() {

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", newsletter);
		newsletter.sendKeys("zsavdcss@gmail.com");
	}
	
	public void clicknewslettertab() {
		newsletter.click();
	}
	
	public void submitbutton() {
		submitbutton.click();
	}

	public String getnewsalert() {
		return alert.getText();
	}

	public String getdangeralert() {
		return dangeralert.getText();
		
		
	}

	
	
	
	
	
	
	
	
	


}