
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scope 
{ 
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouli Sarkar\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
      int c=  driver.findElements(By.tagName("a")).size(); //counting the number of links in the page
      System.out.println("Entire page link: " + c);
      
      //*** limiting driver scope ***
     WebElement footerDriver= driver.findElement(By.xpath("//table[@id='footerTable']")); //counting the number of links in the footer section
    int d= footerDriver.findElements(By.tagName("a")).size();
    System.out.println("Footer links: " +d);
    
  WebElement rowDriver = footerDriver.findElement(By.xpath("//tr[@class='footer-subheadings']"));
  int e= rowDriver.findElements(By.tagName("a")).size();
  
  System.out.println("Footer links in the 1st row: " +e);
  
  //click on the links and check if pages are opening
  for (int i=0; i<e-1; i++)
  {
	  String clickonLink = Keys.chord(Keys.CONTROL,Keys.ENTER); //will open links in separate tabs
	  rowDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
	  Thread.sleep(5000L);
  }
     System.out.println("    ***All tabs openned***    ");
	  Set<String> abc= driver.getWindowHandles();
	  Iterator<String> it = abc.iterator();
	   while(it.hasNext())
	   {
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
	   } 
	  
	   driver.quit();
   	}
	
}
