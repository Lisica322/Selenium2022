package testClass;

import org.junit.jupiter.api.Test;
import testClass.BaseTest;

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
                .clickAllProducts();
        //       .clickSAccessories();

    }
}
