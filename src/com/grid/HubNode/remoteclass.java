package com.grid.HubNode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class remoteclass 
{
	@Test
		public void hubNode() throws MalformedURLException 
		{
			URL remoteaddress = new URL("https://192.168.0.100/wd/hub");
			WebDriver driver = new RemoteWebDriver(remoteaddress, DesiredCapabilities.firefox());
			driver.get("https://www.youtube.com/");
			Reporter.log("facebook login", true);
			driver.close();
		}
	}


