package gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {

	@FindBy(id="identifierId")
	private WebElement Uname;
	
	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[2]")
	private WebElement nxt_btn;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[2]")
	private WebElement next_button;
	
	@FindBy(xpath="//div[@class='T-I T-I-KE L3']")
	private WebElement compose;
	
	@FindBy(xpath="//div[@id=':nu']")
	private WebElement to;
	
	@FindBy(xpath="//div[@id=':py']")
	private WebElement sub;
	
	@FindBy(xpath="//div[@id=':re']")
	private WebElement body;    
	
	@FindBy(xpath="//div[@id=':pn']")
	private WebElement snd_btn;
	
	@FindBy(xpath="//img[@class='gb_Ba gbii']")
	private WebElement profile_btn;
	
	@FindBy(xpath="(//div[@class='BHzsHc'])[1]")
	private WebElement acct_bttn;
	
	@FindBy(id="identifierId")
	private WebElement Uname2;
	
	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[2]")
	private WebElement nxt_btn2;
	
	@FindBy(name="password")
	private WebElement pass2;
	
	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[2]")
	private WebElement nxt_btn3;
	
	@FindBy(xpath="(//div[@class='aio UKr6le'])[1]")
	private WebElement inbox;
	
	@FindBy(xpath="(//img[@class='gb_Ba gbii'])[1]")
	private WebElement prf_btn;
	
	@FindBy(xpath="(//a[@8t5Oc BvDXcd OtBgcb']")
	private WebElement lgt_btn;
	
	
	public Pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		 public void username(String name)
		{
			Uname.sendKeys(name);
		}
		 public void next()
		 {
			 nxt_btn.click();
	}
		 public void password(String word)
		 {
			 pass.sendKeys(word);
		 }
		 public void next1() 
		 {
			 next_button.click(); 
		 }
			public void compose() 
			{
				compose.click();
				
			}
			public void toaddres(String address)
			{
				to.sendKeys(address);	
			}
			public void subject()
			{
				sub.click();
				
			}
			public void body()
			{
				body.click();
			}
			public void sendbutton()
			{
				snd_btn.click();
			}
			public void profile()
			{
				profile_btn.click();
			}
			public void accnt()
			{
				acct_bttn.click();
			}
			
			 public void username2(String name)
				{
					Uname2.sendKeys(name);
				}
				 public void next2()
				 {
					 nxt_btn2.click();
			}
				 public void password2(String word)
				 {
					 pass2.sendKeys(word);
				 }
				 public void next3() 
				 {
					 nxt_btn2.click(); 
				 }
				 public void inbox() 
				 {
					 inbox.click(); 
				 }
				 public void profile2() 
				 {
					prf_btn.click(); 
				 }
				 public void logout() 
				 {
					lgt_btn.click(); 
				 }
}
				 
		

		 
		 




