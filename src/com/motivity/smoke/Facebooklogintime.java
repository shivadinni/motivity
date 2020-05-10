package com.motivity.smoke;

import org.openqa.selenium.WebDriver;

import com.motivity.config.TestConfiguration;
import com.motivity.ui.repo.FacebookMotivity;
import com.motivity.util.DataHandlers;

public class Facebooklogintime {
static 	WebDriver driver;
	FacebookMotivity login;
	
public static void main(String[] args)
{
	driver=TestConfiguration.getinstance();
	FacebookMotivity fb=new FacebookMotivity(driver);
	fb.getFirstnameTextbox().sendKeys("shiva");
	fb.getSurnameTextbox().sendKeys("dinni");
	
}
}
