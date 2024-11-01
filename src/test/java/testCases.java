import PageBase.pageBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.homePage;
import pages.profilePage;
import pages.registerPage;

import java.io.IOException;

public class testCases extends testBase{
    registerPage registerObj;
    profilePage profileObj;
    pageBase baseObj;
    homePage homeObj;
    excelFiles excelData = new excelFiles();

    @DataProvider(name = "excelDataProvider")
    public Object[][] getData() throws IOException {
        return excelData.getExcelData("userData.xlsx/");
    }
    @Test(dataProvider = "excelDataProvider")
    public void userRegister(String firstTxt,String secondTxt,String emailTxt,String Pass, String conPass)
    {
        registerObj = new registerPage(driver);
        profileObj = new profilePage(driver);
        registerObj.registerBtn.click();
        registerObj.createAccount(firstTxt, secondTxt, emailTxt, Pass, conPass);
        Assert.assertTrue(profileObj.verifyRegister.isDisplayed(),"User hasn't been Registered");


    }
    @Test(dependsOnMethods = {"userRegister"})
    public void userReachHotseller()  {
        profileObj = new profilePage(driver);
        baseObj= new pageBase(driver);
        homeObj= new homePage(driver);
        baseObj.waitForElement(profileObj.goHome);
        profileObj.goHome.click();
        baseObj.scrollToElement(homeObj.hotSeller);


    }
@Test(dependsOnMethods = {"userReachHotseller"})
    public void addProduct() {
    baseObj= new pageBase(driver);
    homeObj= new homePage(driver);
    baseObj.hoverElement(homeObj.fisrtItem);
    baseObj.waitForElement(homeObj.productOne);
    homeObj.productOne.click();
    baseObj.waitForElement(homeObj.successAdd);
    Assert.assertEquals(homeObj.successAdd.getText(),"You added product Radiant Tee to the comparison list.");
    baseObj.scrollToElement(homeObj.secondItem);
    baseObj.hoverElement(homeObj.secondItem);
    baseObj.waitForElement(homeObj.productTwo);
    homeObj.productTwo.click();
    baseObj.waitForElement(homeObj.successAdd);
    Assert.assertEquals(homeObj.successAdd.getText(),"You added product Breathe-Easy Tank to the comparison list.");
    Assert.assertEquals(homeObj.itemCount.getText(),"2 items");

}
   }
