import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scope
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouli Sarkar\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      int c=  driver.findElements(By.tagName("a")).size(); //counting the number of links in the page
      System.out.println("Entire page link: " + c);
      
      //*** limiting driver scope ***
     WebElement footerDriver= driver.findElement(By.id("traveller-home")); //counting the number of links in the footer section
    int d= footerDriver.findElements(By.tagName("a")).size();
    System.out.println("Footer links: " +d);
    
   WebElement columnDriver = footerDriver.findElement(By.xpath("//a[@title='Flights'][@class='group-traveller']"));
  int e= columnDriver.findElements(By.tagName("a")).size();
  
  System.out.println("Footer links 1st column: " +e);
  
  //click on the links and check if pages are opening
  for (int i=0; i<columnDriver.findElements(By.tagName("a")).size();i++)
  {
	  String clickonLink = Keys.chord(Keys.CONTROL,Keys.ENTER); //will open links in separate tabs
	  columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
  }
  
    driver.close();
	}

}
