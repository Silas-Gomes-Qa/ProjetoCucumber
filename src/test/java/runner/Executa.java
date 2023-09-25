package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature", 
	    glue = "steps",
		dryRun = true,
		tags = "@regressivos",
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-report.html" }		
		)

public class Executa extends DriversFactory {
	/**
	 * Método responsável por abrir navegador Chrome ou Edge de acordo com valor da
	 * variável navegador.
	 */
	public static void abrirNavegador() {
		String ambiente = "https://www.saucedemo.com";
		String navegador = "Edge";
		if (navegador.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(ambiente);
		driver.manage().window().maximize();
	}

	/**
	 * Método responsável por fechar navegador após os testes.
	 */
	public static void fecharNavegador() {
		driver.quit();
	}
}
