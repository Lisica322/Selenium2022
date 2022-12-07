package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    //Sing in. Account & List
    @FindBy(xpath = "//li[@id='menu-item-31788']")
    private WebElement singIn;


    //Microgreens
    @FindBy(xpath = "//li[@id= 'nav-menu-item-3229']")
    private WebElement menuList;

    //Main menu "Discover all varieties"
    @FindBy(xpath = "//li[@id='nav-menu-item-3229']//child::ul[@class='sub-menu']")
    private List<WebElement> allVarieties;


    @FindBy(xpath = "//div[@id='nav-xshop']")
    private WebElement headerArea;

    @FindBy(xpath = "//li[@id='nav-menu-item-3240']")
    private WebElement productsMicroGreen;

    @FindBy(xpath = "//li[@id='nav-menu-item-3229']//child::ul[@class='sub-menu']")
    private List<WebElement> productsList;

    public RegistrationPage clickSingIn() {
        waitUtilElementToBeClickable(singIn).click();
        return pageManager.getRegistrationPage().clickWindowButton();
    }


    public HomePage clickProductList() {
        Actions action = new Actions(driverManager.getDriver());
        WebElement elem = driverManager.getDriver().findElement(By.xpath("//li[@id= 'nav-menu-item-3229']"));
        action.moveToElement(elem);
        action.perform();
        return this;
    }

    public ProductListPage clickAllVarieties() {
        waitUtilElementToBeClickable(productsMicroGreen).click();

        return pageManager.getProductListPage().defaultMethod();
    }
}