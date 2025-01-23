package br.com.chronosacademy.automacaoWEB;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.enums.Browser;
import br.com.chronosacademy.pages.CursoPage;
import br.com.chronosacademy.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class TestWEB {

    WebDriver driver;
    Driver driverweb;
    PrincipalPage principalPage;
    CursoPage cursoPage;


    @Before
    public void inicializaTeste() {
        driverweb = new Driver(Browser.CHROME);
        driver = driverweb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }

    @Test
    public void primeiroteste() {
        assertEquals("Porque Tempo É Conhecimento.", principalPage.getTitulo());
    }

    @Test
    public void segundoteste() {
        cursoPage = new CursoPage(driver);

        principalPage.clickboton1();

        principalPage.clickboton2();

        cursoPage = new CursoPage(driver);

        assertEquals("Conheça todos os nossos cursos.", cursoPage.getTitulo2());
    }

    @After
    public void finalizarTeste() {
        driver.quit();
    }
}
