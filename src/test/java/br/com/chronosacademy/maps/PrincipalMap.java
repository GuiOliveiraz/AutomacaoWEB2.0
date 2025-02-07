package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalMap {
    @FindBy(xpath = "//section[2]//h4")
    public WebElement txtTitulo;

    @FindBy (xpath = "//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img")
    public WebElement btntituloPOP;

    @FindBy (xpath = "//section[2]/div[3]//a")
    public WebElement btntitulo;
}
