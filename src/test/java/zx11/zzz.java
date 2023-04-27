package zx11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class zzz {

	@Test
	public void m1()
	{
		WebDriver driver = null;
				PU plib=new PU();
				String BROWSER = plib.getKeyValue("browser");
				String URL = plib.getKeyValue("url");
				
				
				
				
				//System.out.println(BROWSER);
				
				
				if(BROWSER.equalsIgnoreCase("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				}
				else if(BROWSER.equalsIgnoreCase("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					driver=new EdgeDriver();
				}
				
				driver.get(URL);
		
		//push jenkins
	}
}
