package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	/**
	 * Método responsável por escrever em um elementos utilizando a class By do
	 * selenium
	 * 
	 * @param elemento
	 * @param texto
	 * @param passo
	 * @author Silas Gomes
	 */
	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("**** Erro ao escrever no passo " + passo + " ****");
			System.out.println("**** Causa do erro " + e.getCause() + " ****");
			System.out.println("**** Menssagem do erro " + e.getMessage() + " ****");
		}

	}

	/**
	 * Método responsável por clicar em um elementos utilizando a class By do
	 * selenium
	 * 
	 * @param elemento
	 * @param passo
	 * @author Silas Gomes
	 */
	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("**** Erro ao clicar no passo " + passo + " ****");
			System.out.println("**** Causa do erro " + e.getCause() + " ****");
			System.out.println("**** Menssagem do erro " + e.getMessage() + " ****");
		}
	}

	/**
	 * Método responsável por validar a URL desejada com URL atual do site
	 * 
	 * @param urlDesejada
	 * @author Silas Gomes
	 */
	public void validarUrl(String urlDesejada) {
		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			System.out.println("**** URL diferente da desejada ****");
			System.out.println("**** Causa do erro " + e.getCause() + " ****");
			System.out.println("**** Menssagem do erro " + e.getMessage() + " ****");
		}
	}

	/**
	 * Método responsável por capturar Screenshot.
	 * 
	 * @param historia
	 * @param nomeDoArquivo
	 */
	public void capturarTela(String historia, String nomeDaEvidencia) {
		String timestamp = new SimpleDateFormat("ddMMYYYY").format(new Date());
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot,
					new File("./evidencias/" + historia + "/" + timestamp + "/" + nomeDaEvidencia + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	public void validarTexto(By elemento, String msgEsperada) {
		try {
			assertEquals(msgEsperada, driver.findElement(elemento).getText());
		} catch (Exception e) {
			System.out.println("**** URL diferente da desejada ****");
			System.out.println("**** Causa do erro " + e.getCause() + " ****");
			System.out.println("**** Menssagem do erro " + e.getMessage() + " ****");
		}
	}
}
