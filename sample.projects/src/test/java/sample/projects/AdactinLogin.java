package sample.projects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin {
static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	
@Before
public void before() {
TakesScreenshot screenshot = (TakesScreenshot)driver;


}
	
	
	
}
