package managers;

import pages.*;

public class PageManager {

    ProductListPage productListPage;

    private static PageManager pageManager;

    private HomePage homePage;

    private InsurancePage insurancePage;

    private RegistrationPage registrationPage;

    private ProductInfo productInfo;

    private BasketPage basketPage;

    private CheckoutPage checkoutPage;

    public ProductInfo getProductInfo() {
        if (productInfo == null) {
            productInfo = new ProductInfo();
        }
        return productInfo;
    }

    public ProductListPage getProductListPage() {
        if (productListPage == null) {
            productListPage = new ProductListPage();
        }
        return productListPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }


    public BasketPage getBasketPage() {
        if (basketPage == null) {
            basketPage = new BasketPage();
        }
        return basketPage;
    }


    public InsurancePage getInsurancePage() {
        if (insurancePage == null) {
            insurancePage = new InsurancePage();
        }
        return insurancePage;
    }

    public static PageManager getPageManager() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
        return pageManager;
    }


    public RegistrationPage getRegistrationPage() {
        if (registrationPage == null) {
            registrationPage = new RegistrationPage();
        }
        return registrationPage;
    }

    public CheckoutPage getCheckoutPage() {
        if (checkoutPage == null) {
            checkoutPage = new CheckoutPage();
        }
        return checkoutPage;
    }
}
