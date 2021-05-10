import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create driver object for chrome browser
		// Invoke .exe file first

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouli Sarkar\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("http://facebook.com");
		// driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		// driver.close();

		driver.get("https://www.guru99.com/software-testing.html");
		String t = driver.getTitle();
		System.out.println(t);

		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();

		driver.close();

	}

}
