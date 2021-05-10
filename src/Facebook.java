import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	// static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouli Sarkar\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://facebook.com");
		// driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		// driver.findElement(By.name("pass")).sendKeys("$%^&*");

		// driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		// driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("%^&*(");
		// driver.findElement(By.xpath("//*[@id='u_0_b']")).click();

		/*
		 * driver.findElement(By.cssSelector("input[name='email']")).sendKeys(
		 * "sarkarmouli92@gmail.com"); //own css
		 * driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(" PratyayS ");
		 * driver.findElement(By.cssSelector("[value='Log In']")).click();
		 */

		// Regular expression
		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("[title*='Sign in']")).click();
		// driver.close();

	}

}
