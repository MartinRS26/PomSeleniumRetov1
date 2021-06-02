package com.automationpractice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipalPage {

	private WebDriver driver;
	@FindBy(xpath ="//*[@id=\"header\"]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")
	WebElement registrarse;
	public PaginaPrincipalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void click(WebElement elemento) {
		elemento.click();
	}

	public void registrar() {
		click(registrarse);
	}
}
