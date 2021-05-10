import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class cartValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouli Sarkar\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  
		String[] veggies= {"Brocolli","Cauliflower","Cucumber","Beetroot","Carrot","Tomato","Beans","Brinjal"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);
		addItems(driver,veggies);
	}
		public static void addItems(WebDriver driver, String[] veggies)
		{
			WebDriverWait w = new WebDriverWait(driver,5);
			int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size();i++)
		{
			String[] name= products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//format(trim) it to get actual vegetable name
			//check whether extracted name is present in array or not
			//convert array into array list for easy search
			List veggieList = Arrays.asList(veggies);
			
			if(veggieList.contains(formattedName))
			{
				j++;
				//click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==products.size())
				   break;
				   
			}
						
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy"); //cssSelector: "input.promocode"
	    driver.findElement(By.cssSelector("button.promoBtn")).click();
	    
	    //Explicit wait
	  
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	    String text= driver.findElement(By.cssSelector("span.promoInfo")).getText();
	   System.out.println(text);
	   driver.close(); 
	   
		}
		
	}
}

