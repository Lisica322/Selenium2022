package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends BasePage {

    //Registration box
    @FindBy(xpath = "//div[@data-id='7620959']//child::div[@class= 'elementor-button-wrapper']")
    private WebElement regBox;

    //email or mobile phone number
    @FindBy(xpath = "//input[@id='user']")
    private WebElement email;

    //Change Language
    @FindBy(xpath = "//div[@class='top-bar-right  widget_weglot-translate']//child::aside")
    private WebElement language;

    //English language
    @FindBy(xpath = "//div[@class='top-bar-right  widget_weglot-translate']//child::li[@data-l='en']")
    private WebElement english;

    //Password
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    //sign In Submit
    @FindBy(xpath = "//button[@name='wp-submit']")
    private WebElement singInButton;

    @FindBy(xpath = "//*[@aria-label= 'Amazon']")
    private WebElement title;

    //button spice
    @FindBy(xpath = "//body[@data-elementor-device-mode ='desktop']")
    private WebElement buttonSpice;

    //button window
    @FindBy(xpath = "//a[@id='CookieBoxSaveButton']")
    private WebElement button;

    public WebElement getButtonSpice() {
        return buttonSpice;
    }

    /* public RegistrationPage checkOpenPage(String nameProduct) {
            Assertions.assertEquals("Header missing/does not match required",
                    nameProduct,
                    title.getText());
            return this;
        }*/
    public RegistrationPage clickWindowButton() {

    //    WebElement frameName = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[@data-elementor-device-mode ='desktop']")));
        waitUtilElementToBeClickable(button).click();
        return this;
    }

    public RegistrationPage clickLanguage() {
        waitUtilElementToBeClickable(language).click();
        return this;
    }  public RegistrationPage clickEnglishLanguage() {
        waitUtilElementToBeClickable(english).click();
        return this;
    }
    public RegistrationPage clickRegBox() {
        waitUtilElementToBeClickable(regBox).click();
        return this;
    }

    public RegistrationPage clickEmail(String emailString) {
        waitUtilElementToBeClickable(email).click();
         email.sendKeys(emailString);
        return this;
    }

    public RegistrationPage clickPassword(String passwordString) {
        waitUtilElementToBeClickable(password).click();
        password.sendKeys(passwordString);
        return this;
    }

    public HomePage clickSingInButton() {
        waitUtilElementToBeClickable(singInButton).click();
        return pageManager.getHomePage().clickProductList();

    }
}