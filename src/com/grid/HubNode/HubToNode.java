package com.grid.HubNode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class HubToNode 
{
	@Test
	public void hubNode(XmlTest x) throws MalformedURLException 
	{
		String bn=x.getParameter("browser");
		URL remoteaddress = new URL("http://192.168.0.101:4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(bn);
		WebDriver driver = new RemoteWebDriver(remoteaddress, dc);
		driver.get("https://www.google.com/");
		
		Reporter.log("google in :  " + bn ,true);
		//driver.close();
		
		/*
		URL remoteaddress2 = new URL("http://192.168.0.101:4444/wd/hub");
		
		WebDriver driver2 = new RemoteWebDriver(remoteaddress2, DesiredCapabilities.chrome());
		driver2.get("https://www.google.com/");
		Reporter.log("youtube login in chrome", true);
		driver2.close(); */
		
       /*URL remoteaddress3 = new URL("http://192.168.0.101:4444/wd/hub");
       WebDriver driver3 = new RemoteWebDriver(remoteaddress3, DesiredCapabilities.internetExplorer());
       driver3.get("https://www.youtube.com");
       Reporter.log("youtube open in IE", true);
       driver3.close();*/
	}
}
       
       
