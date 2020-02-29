import org.junit.*;
import org.openqa.grid.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;



public class SampleDriverScript {
	
	public WebDriver driver;
	
	@Test
	public void driver() {
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		 firefoxBinary.addCommandLineOptions("--headless");
		 firefoxBinary.addCommandLineOptions("--no-sandbox");
		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","/home/priyank/geckodriver.exe");
        
		driver.get("http://www.google.com");
        
	}
	
	@After
    public void endTest() {
        driver.quit();
    }

}
