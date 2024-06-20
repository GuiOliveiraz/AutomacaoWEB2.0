package br.com.chronosacademy.AutomacaoWEB;

import br.com.chronosacademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class TestWEB {

    WebDriver driver;
    Driver driverweb;

    @Before
    public void inicializaTeste() {
        driverweb = new Driver("chrome");
        driver = driverweb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
    }

    @Test
    public void primeiroteste() {
        assertEquals("Porque Tempo É Conhecimento.", getTitulo());

    }

    private String getTitulo() {
        String xpatchTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpatchTitulo));
        return txtTitulo.getText();
    }


    @Test
    public void segundoteste() {

        clickboton1();

        clickboton2();

        assertEquals("Conheça todos os nossos cursos.", getTitulo2());
    }

    private String getTitulo2() {
        String cssTitulo = "div.text-center > div.large-h1";
        WebElement txtTitulo = driver.findElement(By.cssSelector(cssTitulo));
        return txtTitulo.getText();
    }

    private void clickboton2() {
        String xpathBotao = "//section[2]/div[3]//a";
        WebElement btntitulo = driver.findElement(By.xpath(xpathBotao));
        btntitulo.click();
    }

    private void clickboton1() {
        String xpathBotaoPOP = "//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img";
        WebElement btntituloPOP = driver.findElement(By.xpath(xpathBotaoPOP));
        btntituloPOP.click();
    }

    @After
    public void finalizarTeste() {
        driver.quit();
    }
}
