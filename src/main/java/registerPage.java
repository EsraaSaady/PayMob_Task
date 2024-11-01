import PageBase.pageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPage extends pageBase {

    public registerPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
    public WebElement registerBtn;
    @FindBy(id="firstname")
    public WebElement firstName;
    @FindBy(id="lastname")
    public WebElement secondName;
    @FindBy(id="email_address")
    public WebElement Email;
    @FindBy(id="password")
    public WebElement Password;
    @FindBy(id="password-confirmation")
    public WebElement conPassword;
    @FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button")
    public WebElement submitBtn;
    public void createAccount(String firstTxt,String secondTxt,String emailTxt,String Pass, String conPass)
    {
        firstName.sendKeys(firstTxt);
        secondName.sendKeys(secondTxt);
        Email.sendKeys(emailTxt);
        Password.sendKeys(Pass);
        conPassword.sendKeys(conPass);
        submitBtn.click();
    }
}
