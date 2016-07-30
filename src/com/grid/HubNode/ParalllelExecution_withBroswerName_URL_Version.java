package com.grid.HubNode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ParalllelExecution_withBroswerName_URL_Version 
{
	@Test
	public void ParalllelExecution(XmlTest x) throws MalformedURLException, InterruptedException
	{
		String browsertype = x.getParameter("browser");
		String versionNumber = x.getParameter("version");
		//String platformtype =x.getParameter("platform");
		
		URL remoteaddress = new URL(x.getParameter("url"));
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browsertype);
		dc.setVersion(versionNumber);
		dc.setPlatform(Platform.WINDOWS);
		Reporter.log("browser version is:  " + dc.getVersion());
		Reporter.log("browser Name is:  " + dc.getBrowserName());
		Reporter.log("OS platform is:  " + dc.getPlatform());
		WebDriver driver = new RemoteWebDriver(remoteaddress, dc);
		driver.get("https://www.gmail.com/");
		//Thread.sleep(5000);
		driver.close();
	}

}
