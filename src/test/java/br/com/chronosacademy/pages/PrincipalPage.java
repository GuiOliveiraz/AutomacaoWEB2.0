package br.com.chronosacademy.pages;

import br.com.chronosacademy.maps.PrincipalMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    WebDriver driver;
    PrincipalMap principalMap;


    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver,principalMap);
    }

    public String getTitulo() {
            String xpatchTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpatchTitulo));
        return txtTitulo.getText();
    }
    public void clickboton1() {
        String xpathBotaoPOP = "//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img";
        WebElement btntituloPOP = driver.findElement(By.xpath(xpathBotaoPOP));
        btntituloPOP.click();

    }
    public void clickboton2() {
        String xpathBotao = "//section[2]/div[3]//a";
        WebElement btntitulo = driver.findElement(By.xpath(xpathBotao));
        btntitulo.click();
    }
}
