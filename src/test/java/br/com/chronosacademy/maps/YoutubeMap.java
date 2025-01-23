package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YoutubeMap {
    @FindBy(css = ".ytSearchboxComponentInput")
    public WebElement inpPesquisa;

    @FindBy (xpath = "//yt-searchbox/button")
    public WebElement btnPesquisa;

    @FindBy(xpath = "//ytd-two-column-search-results-renderer//ytd-item-section-renderer[1]//ytd-video-renderer[1]//h3//yt-formatted-string")
    public WebElement btnVideo;

    @FindBy(xpath = "//ytd-watch-metadata//h1/yt-formatted-string")
    public WebElement textValidYoutube;
}
