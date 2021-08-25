package ANKALAYYA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sita {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\seliniumfiles\\drivers\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.redbus.in/");
		//bo.findElement(By.cssSelector("a[id=\"redBus Bus Hire\"]"));
		//bo.findElement(By.cssSelector("a[class=\"site-links gtm-busHire\"]")).click();
		//bo.findElement(By.xpath("//a[contains(@class,'site-links gtm-busHire')]")).click();
		//bo.findElement(By.xpath("//a[starts-with(@title,'redBus Bus Hire')]")).click();
		//bo.findElement(By.xpath("//*[text()=\"BUS HIRE \"]")).click();
		//bo.findElement(By.xpath("//*[text()='content']")).click();//
		//List<WebElement> x=bo.findElements(By.xpath("//input[@type='text']"));
		//System.out.println(x.size());
		//List<WebElement> y=bo.findElements(By.tagName("select"));
		//System.out.println(y.size());
		//List<WebElement> z=bo.findElements(By.tagName("a"));
		//System.out.println(z.size());
		//List<WebElement> g=bo.findElements(By.xpath("//input[@type='checkbox']"));
		//System.out.println(g.size());
		//System.out.println(bo.findElement(By.id("redBus Bus Hire")).getSize());
		//System.out.println(bo.findElement(By.id("redBus Bus Hire")).getLocation());
		Actions acr=new Actions(bo);
		//acr.clickAndHold(bo.findElement(By.id("redBus Bus Hire"))).perform();
		//acr.doubleClick(bo.findElement(By.id("redBus Bus Hire"))).perform();
		//acr.contextClick(bo.findElement(By.id("redBus Bus Hire"))).perform();
		Thread.sleep(1000);
		bo.close();
	}

}
