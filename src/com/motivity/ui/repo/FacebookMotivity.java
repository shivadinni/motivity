package com.motivity.ui.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookMotivity {
	WebDriver driver;
public FacebookMotivity(WebDriver driver)
{
	this.driver=driver;
}
public WebElement getFirstnameTextbox()
{
	WebElement element =driver.findElement(By.xpath("//*[@id='u_0_m']"));
	return element;
}
public WebElement getSurnameTextbox()
{
	WebElement element =driver.findElement(By.xpath("//*[@id='u_0_o']"));
	return element;
}
}
