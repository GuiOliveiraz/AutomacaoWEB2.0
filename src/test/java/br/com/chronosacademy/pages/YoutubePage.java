package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.YoutubeMap;
import org.openqa.selenium.support.PageFactory;

public class YoutubePage {
    YoutubeMap youtubeMap;

    public YoutubePage() {
        youtubeMap = new YoutubeMap();
        PageFactory.initElements(Driver.getDriver(), youtubeMap);
    }

    public void setInpPesquisa(String pesquisa) {
        youtubeMap.inpPesquisa.sendKeys(pesquisa);
    }

    public void clickbtnPesquisa() {
        youtubeMap.btnPesquisa.click();
    }

    public void clickVideo() {
        youtubeMap.btnVideo.click();
    }

//  VALIDACAO DO TEXTO


    public String getTextNewAccount() {
        Driver.visibilityOf(youtubeMap.textValidYoutube);
        return youtubeMap.textValidYoutube.getText();
    }
}
