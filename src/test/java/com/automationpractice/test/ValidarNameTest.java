package com.automationpractice.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automationpractice.page.IngresoUsuarioPage;
import com.automationpractice.page.PaginaPrincipalPage;
import com.automationpractice.page.UsuarioSignInPage;

public class ValidarNameTest {
	private String rutaWebDriver = "src/test/java/driver/chromedriver.exe";
	private String URL = "http://automationpractice.com/index.php";
	WebDriver driver;

	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", rutaWebDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// test
	@Test
	public void ValidarName() {
		driver.get(URL);
		PaginaPrincipalPage page = new PaginaPrincipalPage(driver);
		page.registrar();
		IngresoUsuarioPage TitleandForm = new IngresoUsuarioPage(driver);
		TitleandForm.validarTexto();
		TitleandForm.ingresarInfo();
		UsuarioSignInPage UserName = new UsuarioSignInPage(driver);
		UserName.validarNombre();

	}
	
	@After
	public void LogOut() {
		UsuarioSignInPage CerrarSesion = new UsuarioSignInPage(driver);
		CerrarSesion.logOut();
	}
}
