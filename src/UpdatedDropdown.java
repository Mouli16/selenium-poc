import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouli Sarkar\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000L);

		// handling checkboxes
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // reg exp.
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// count no. of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());

		// handling dropdowns
		WebElement dDropdown = driver.findElement(By.id("divpaxinfo"));
		dDropdown.click();
		Thread.sleep(1000L);
		System.out.println("Before increment: " + dDropdown.getText());
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;

		}
		System.out.println("After increment: " + dDropdown.getText());

		Assert.assertEquals(dDropdown.getText(), "5 Adult");

		driver.findElement(By.id("btnclosepaxoption")).click();

		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		// //before selecting (doesn't work)

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // before clicking
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // after clicking

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}
	}

}
