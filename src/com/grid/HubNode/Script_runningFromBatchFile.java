package com.grid.HubNode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Script_runningFromBatchFile 
{
	@Test
	public void launchBrowset(XmlTest x) throws MalformedURLException, InterruptedException
	{
	String browsertype = x.getParameter("browser");
	String versionNumber = x.getParameter("version");
   URL remoteaddress = new URL("http://192.168.0.101:4444/grid/register");    //x.getParameter("url"));
   DesiredCapabilities dc = new DesiredCapabilities();
   dc.setBrowserName(browsertype);
   dc.setVersion(versionNumber);
   WebDriver driver = new RemoteWebDriver(remoteaddress, dc);
   driver.get("https://www.facebook.com/");
   driver.findElement(By.id("email")).sendKeys("cns.praveen@gmail.com");
   driver.findElement(By.id("pass")).sendKeys("neelakanta@11*");
   driver.findElement(By.id("u_0_m")).click();
   Reporter.log(browsertype + ":   user loged into Facebook ", true);
   Thread.sleep(24000);
   driver.close();
	}
}
