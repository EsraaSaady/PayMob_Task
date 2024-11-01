package pages;

import PageBase.pageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends pageBase {
    public homePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[2]/main/div[3]/div/div[2]/div[2]/h2")
    public WebElement hotSeller;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[4]/div/div/ol/li[1]/div/div/div[4]/div/div[2]/a[2]")
    public WebElement productOne;
    @FindBy(xpath = "/html/body/div[2]/main/div[3]/div/div[2]/div[4]/div/div/ol/li[2]/div/div/div[4]/div/div[2]/a[2]")
    public WebElement productTwo;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[4]/div/div/ol/li[1]")
    public WebElement fisrtItem;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[4]/div/div/ol/li[2]/div/a/span/span/img")
    public WebElement secondItem;
    @FindBy(xpath="/html/body/div[2]/header/div[2]/ul")
    public WebElement screen;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
    public WebElement successAdd;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/ul/li/a/span")
    public WebElement itemCount;

}
