package firstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageTitle {
	WebDriver driver;

	@BeforeClass
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationData\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void getPageTitle() {
		driver.get("https://www.youtube.com/");
		System.out.println("page title is : " + driver.getTitle());
	}

	@Test
	public void getPageTitle2() {
		driver.get("https://www.youtube.com/");
		System.out.println("page title is : " + driver.getTitle());
	}
}