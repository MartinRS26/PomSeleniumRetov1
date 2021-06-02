package com.automationpractice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsuarioSignInPage {
	private WebDriver driver;
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
	WebElement Nombre_usuario;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement BtnSignOut;
    
	public UsuarioSignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
	
	public void validarNombre() {
		String mensaje = Nombre_usuario.getText();
		System.out.println("Texto");
		System.out.println(mensaje);
		esperar();
	}
	
	public void logOut() {
		click(BtnSignOut);
	}
	
	

}
