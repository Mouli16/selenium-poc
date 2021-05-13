import java.io.File;

import java.io.IOException;

import java.util.HashMap;



import org.testng.Assert;

import org.testng.annotations.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class FileUpload {



public static void main(String[] args) throws InterruptedException, IOException {

// TODO Auto-generated method stub

String downloadPath=System.getProperty("user.dir");

System.setProperty("webdriver.chrome.driver","C:\\Users\\Mouli Sarkar\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");

HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

chromePrefs.put("profile.default_content_settings.popups", 0);

chromePrefs.put("download.default_directory", downloadPath);

ChromeOptions options=new ChromeOptions();

options.setExperimentalOption("prefs", chromePrefs);

WebDriver driver=new ChromeDriver(options);

driver.manage().window().maximize();

driver.get("https://altoconvertpdftojpg.com/");

driver.findElement(By.cssSelector("[class*='btn--choose']")).click();

Thread.sleep(3000);

Runtime.getRuntime().exec("C:\\Users\\Mouli Sarkar\\Documents\\Selenium\\fileupload.exe");

WebDriverWait wait=new WebDriverWait(driver,10);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));

driver.findElement(By.cssSelector("button[class*='medium']")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='output-result__download']/a")));

driver.findElement(By.xpath("//div[@class='output-result__download']/a")).click();

Thread.sleep(5000);

File f=new File(downloadPath+"/1.jpg");

if(f.exists())

{

System.out.println("file exits in: " +downloadPath);
 driver.findElement(By.xpath("//button[@class='review-sites-popup__close']")).click();
 Thread.sleep(2000L);
}
driver.close();
}


}

/**Assert.assertTrue(f.exists());

if(f.delete()) **/
