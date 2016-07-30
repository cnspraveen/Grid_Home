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

public class ParallelExecution_with_differentBrowser
{
	@Test
	public void parallelExecution(XmlTest t) throws MalformedURLException, InterruptedException
	{
	String browsertype = t.getParameter("browser");
	String versionofbrowser = t.getParameter("versionofbrowser");
    URL remoteaddress = new URL(t.getParameter("url"));
    DesiredCapabilities dc = new DesiredCapabilities();
    dc.setBrowserName(browsertype);
    dc.setVersion(versionofbrowser);
   // dc.setPlatform(Platform.WINDOWS);
    WebDriver driver = new RemoteWebDriver(remoteaddress, dc);
    driver.get("https://www.google.com");
    Reporter.log(dc.getVersion() + ":  is the Version of   " + browsertype, true);
    Reporter.log(dc.getBrowserName()+ ":  is the browser", true);
    //Reporter.log(dc.getPlatform() + " : is the platform", true);
    Thread.sleep(5000);
    driver.close();
	}
}
