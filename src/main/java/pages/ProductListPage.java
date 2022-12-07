package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends BasePage {




    @FindBy(xpath = "//li[starts-with(@class,'product type-product')]")
    private List<WebElement> productsList;

    //Good for the start link
    @FindBy(xpath = "//a[contains(text(),'Good for the start')]")
    private WebElement goodForTheStartButton;

    public ProductListPage defaultMethod() {
                        return this;
    }
 public ProductListPage clickGoodForTheStart() {
        waitUtilElementToBeClickable(goodForTheStartButton).click();
                        return this;
    }

    public ProductInfo clickAllProducts(int productNumber) {
                productsList.get(productNumber).click();

        return pageManager.getProductInfo().defaultMethod();
    }

}
