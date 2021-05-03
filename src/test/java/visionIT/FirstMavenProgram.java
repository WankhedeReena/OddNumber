package visionIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenProgram {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in//Index.html");
		driver.findElement(By.id("email"));
		driver.findElement(By.id("enterimg"));
		
	}
}