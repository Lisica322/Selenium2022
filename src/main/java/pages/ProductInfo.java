package pages;

import data.Product;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Quantity;

import java.util.List;
import java.util.Set;

public class ProductInfo extends BasePage {
    Product product;
    //add button
    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt wp-element-button']")
    private WebElement addToShoppingCart;

    //reset button
    @FindBy(xpath = "//a[@class='reset_variations']")
    private WebElement reset;

    //quantity button
    @FindBy(xpath = "//li[@class='cgkit-attribute-swatch cgkit-button']")
    private List<WebElement> quantityList;

    //button cross
    @FindBy(xpath = "//div[@class='close-drawer']")
    private WebElement closeTheWindow;

    //button back to list
    @FindBy(xpath = "//a[contains(text(),'Organic Seeds Microgreen')]")
    private WebElement backToList;



    public ProductInfo defaultMethod() {
        return this;
    }


    public ProductInfo chooseQuantity(Quantity quantity) {
        switch (quantity) {
            case FIFTY_GRAMS:
                reset.click();
                quantityList.get(0).click();
                break;

            case ONE_HUNDRED_GRAM:
                reset.click();
                quantityList.get(1).click();
                break;

            case FIVE_HUNDRED_GRAMS:
                reset.click();
                quantityList.get(2).click();
                break;

            case ONE_THOUSAND_GRAM:
                reset.click();
                quantityList.get(3).click();
                break;
        }
        return this;
    }
    public ProductInfo clickAdd() {
        waitUtilElementToBeClickable(addToShoppingCart).click();
        return this;
    }

    public ProductInfo clickCross() {
        Set<String> windowHandles = driverManager.getDriver().getWindowHandles();
        for (String winHandle : windowHandles) {
            driverManager.getDriver().switchTo().window(winHandle);

            waitUtilElementToBeClickable(closeTheWindow).click();
        }
        return this;
    }
    public ProductListPage clickBackToList(){
        waitUtilElementToBeClickable(backToList).click();
        return pageManager.getProductListPage().defaultMethod();
    }
}