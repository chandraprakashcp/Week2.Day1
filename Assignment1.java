package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Create Contact")).click();
driver.findElement(By.id("firstNameField")).sendKeys("Chandra Prakash");
driver.findElement(By.id("lastNameField")).sendKeys("Chandrasekar");
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println(title);
String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
System.out.println(text);
driver.close();
}
}
