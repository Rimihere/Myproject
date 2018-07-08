package com.qa.Sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TestSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {

System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Tools\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.rediff.com/");
//*[@id='gb_70']
driver.findElement(By.xpath("//*[@id='gb_70']")).click();
Screen screen=new Screen();
Pattern createaccount=new Pattern("C:\\Selenium\\Images\\CreateAccount.JPG");
Thread.sleep(5000);
screen.click(createaccount);
System.out.println("My test for GIT");






	}

}
