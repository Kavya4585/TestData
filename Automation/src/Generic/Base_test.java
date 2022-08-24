package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_Const
{
 public static WebDriver driver;
@BeforeMethod
public void openApp()
{
	System.setProperty(geckokey, geckovalue);
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
}

@AfterMethod
public void closeapp(ITestResult result) throws InterruptedException, IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
			Takescreenshot.shot(driver);
	}
	Thread.sleep(3000);
	driver.close();
}
}

	

