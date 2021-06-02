package com.automationpractice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IngresoUsuarioPage {

	private WebDriver driver;

	@FindBy(xpath = "//*[@id=\"login_form\"]/h3")
	WebElement Already_registered;

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement IngresoEmail;

	@FindBy(xpath = "//*[@id=\"passwd\"]")
	WebElement IngresoPassword;

	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
	WebElement BtnLogin;

	public IngresoUsuarioPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void validarTexto() {
		String mensaje = Already_registered.getText();
		System.out.println("Texto");
		System.out.println(mensaje);
	}

	public void escribir(WebElement elemento, String texto) {
		elemento.sendKeys(texto);
	}
	public void click(WebElement elemento) {
		elemento.click();
	}

	public void esperar() {
		try {
			Thread.sleep((long) (3 * 1000));
		} catch (InterruptedException var3) {
			var3.printStackTrace();
		}
	}

	public void ingresarInfo() {
		
		escribir(IngresoEmail, "martinrodriii.2604@gmail.com");
		escribir(IngresoPassword, "12345");
		esperar();
		click(BtnLogin);
	}

}
