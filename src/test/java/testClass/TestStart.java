package testClass;

import org.junit.jupiter.api.Test;
import testClass.BaseTest;
import util.Quantity;

public class TestStart extends BaseTest {

    @Test
    public void testStart() {
        app.getHomePage()
                /*
                       ---------registration form---------

                      .clickSingIn()
                      .clickWindowButton()
                      .clickLanguage()
                      .clickEnglishLanguage()
                     .clickRegBox()
                      .clickEmail("Test.QA.Test322@gmail.com")
                      .clickPassword("TestTest322")
                      .clickSingInButton()

                      ---------registration form---------
                      */

                .clickProductList()
                .clickAllVarieties()
                .clickAllProducts(2)
                .chooseQuantity(Quantity.ONE_THOUSAND_GRAM)
                .clickAdd()
                .clickCross()
                .clickBackToList()
                .clickGoodForTheStart()
                .clickAllProducts(1)
                .chooseQuantity(Quantity.FIVE_HUNDRED_GRAMS)
                .clickAdd()
                .clickCross();

    }
}
