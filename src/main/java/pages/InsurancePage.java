package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsurancePage extends BasePage{

    @FindBy(xpath = "//*[@aria-label= 'Amazon']")
    private WebElement title;

    public InsurancePage checkOpenPage(String nameProduct) {
        Assertions.assertEquals("Заголовок отсутствует/не соответствует требуемому",
                nameProduct,
                title.getText());
        return this;
    }
}
