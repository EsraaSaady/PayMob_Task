package pages;

import PageBase.pageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class profilePage extends pageBase {
    public profilePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]")
    public WebElement verifyRegister;
    @FindBy(xpath="/html/body/div[2]/header/div[2]/a")
    public WebElement goHome;

}
