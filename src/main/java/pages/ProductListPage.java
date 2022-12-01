package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends BasePage {

    //price
    @FindBy(xpath = "//li[starts-with(@class,'product type-product')]")
    private List<WebElement> productsList;


    public ProductListPage clickAllProducts() {
        for (int i = 0; i < productsList.size(); i++) {

            int count = driverManager.getDriver().findElements(By.xpath("//li[starts-with(@class,'product type-product')]")).size();
            System.out.println(count);
            //      waitUtilElementToBeClickable(productsList).click();
        }
        return this;
    }

}
