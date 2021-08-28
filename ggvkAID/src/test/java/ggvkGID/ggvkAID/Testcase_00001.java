package ggvkGID.ggvkAID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_00001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\seliniumfiles\\drivers\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("rrrrr");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText());
		if(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
			System.out.println("TC_00002 PASS");
		}
		else {
			System.out.println("TC_00002 FAIL");
		}
		bo.close();
  }

}
