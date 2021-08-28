package ggvkGID.ggvkAID;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Tc {
  
 WebDriver bo;
String bpath="http://apps.qaplanet.in/hrm/login.php";
	
@Test(enabled=true,priority=5,groups="login")
public void TC_00001() { 
	bo.get(bpath);
    bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
    bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	System.out.println(bo.getTitle());
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
}
@Test(enabled=true,priority=4,groups="login")
public void TC_00002(){
	bo.get(bpath);
  bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("rrrrr");
	bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	System.out.println(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText());
  Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login" );
}
@Test(enabled=true,priority=3,groups="login")
public void TC_00003() {
	  
	bo.get(bpath);
  bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
	bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab2");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login" );
}
@Test(enabled=true,priority=2,groups="login")
public void TC_00004() {
	bo.get(bpath);
  bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("RRRRR");
	bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("YYYY");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
}
@Test(enabled=true,priority=1,groups="login")
public void TC_00005() {
  bo.get(bpath);
  bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("");
  bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
  System.out.println(bo.switchTo().alert().getText());
  Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
  bo.switchTo().alert().accept();     
}
@BeforeMethod
public void beforemethod() {
	  System.setProperty("webdriver.chrome.driver","E:\\seliniumfiles\\drivers\\chromedriver.exe");
	  bo=new ChromeDriver();
	  bo.get(bpath);
}
@AfterMethod
public void aftermethod() {
	    bo.close();
	  
}
}
