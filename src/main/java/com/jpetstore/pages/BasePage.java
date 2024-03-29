package com.jpetstore.pages;

import com.jpetstore.utils.PetCategories;
import net.serenitybdd.core.pages.PageObject;
import org.apache.regexp.RE;
import org.openqa.selenium.By;

public class BasePage extends PageObject {

    private static final String ENTER_THE_STORE_LINK = "//a[contains(text(),'Enter the Store')]";

    private static final String SIGN_IN_LINK = "//a[contains(text(),'Sign In')]";

    private static final String LOGO_LINK = "//div[@id='LogoContent']//a//img";

    private static final String SIGN_OUT_LINK = "";

    private static final String MY_ACCT_LINK = "";

    private static final String HELP_LINK = "//a[contains(text(),'?')]";

    private static final String SHOPPING_CART_LINK = "//img[@name='img_cart']";

    private static final String SEARCH_INPUT = "//input[@name='keywords']";

    private static final String SEARCH_BUTTON = "//input[@id='searchProducts']";

    // Product Quick Links
    private static final String FISH_LINK = "//div[@id='QuickLinks']//a[1]//img[1]";

    private static final String DOGS_LINK = "//div[@id='Header']//a[2]//img[1]";

    private static final String REPTILES_LINK = "//div[@id='Header']//a[3]//img[1]";

    private static final String CATS_LINK = "//div[@id='Header']//a[4]//img[1]";

    private static final String BIRDS_LINK = "//div[@id='Header']//a[5]//img[1]";

    private static final String BANNER_IMG = "";



    /**
     * Method used to navigate to the signOn Page
     *
     * @return
     */

    public LoginPage navigateToSignOnPage() {

        open();

        waitForTextToAppear("Welcome to JPetStore Demo Application on MyBatis + Spring Boot + Spring Security + Thymeleaf");

        waitFor(ENTER_THE_STORE_LINK).$(ENTER_THE_STORE_LINK).click();

        waitFor(SIGN_IN_LINK).$(SIGN_IN_LINK).click();

        return this.switchToPage(LoginPage.class);
    }

    /**
     * Clicks on the Sign In Link
     * @return
     */

    public LoginPage clickOnSignOnLink() {

        waitFor(SIGN_IN_LINK).find(By.xpath(SIGN_IN_LINK)).click();

        return this.switchToPage(LoginPage.class);
    }

    /**
     * Navigate to DashBoard
     *
     * @return
     */
    public DashBoardPage navigateToDashBoard() {

        waitFor(LOGO_LINK).$(LOGO_LINK).click();

        return this.switchToPage(DashBoardPage.class);
    }

    /**
     * sign out of the store
     *
     * @return
     */
    public DashBoardPage signOut() {

        waitFor(SIGN_OUT_LINK).$(SIGN_OUT_LINK).click();

        return this.switchToPage(DashBoardPage.class);
    }

    /**
     * Navigate to my accounts page
     *
     * @return
     */
    public AccountsPage navigateToAccountPage() {

        return this.switchToPage(AccountsPage.class);
    }

    /**
     * Use this method to search for a product
     *
     * @param searchValue
     * @return
     */
    public ProductsPage searchForProduct(String searchValue) {

        waitFor(SEARCH_INPUT).$(SEARCH_INPUT).type(searchValue);

        waitFor(SEARCH_BUTTON).$(SEARCH_BUTTON).click();

        return this.switchToPage(ProductsPage.class);
    }

    /**
     * Navigate to Help Page
     *
     * @return
     */
    public HelpPage navigateToHelpPage() {

        waitFor(HELP_LINK).$(HELP_LINK).click();

        return this.switchToPage(HelpPage.class);
    }

    /**
     * Click on Shopping cart on Dashboard
     *
     * @return
     */
    public ProductsPage navigateToShoppingCart() {

        waitFor(SHOPPING_CART_LINK).$(SHOPPING_CART_LINK);

        return this.switchToPage(ProductsPage.class);
    }

    /**
     * Method to select a product category from the header
     *
     * @param productCategory
     * @return
     */
    public ProductsPage navigateToProductCategory(PetCategories productCategory) {

        switch (productCategory) {

            case FISH:

                waitFor(FISH_LINK).$(FISH_LINK);
                return this.switchToPage(ProductsPage.class);

            case CATS:

                waitFor(CATS_LINK).$(CATS_LINK);
                return this.switchToPage(ProductsPage.class);

            case DOGS:

                waitFor(DOGS_LINK).$(DOGS_LINK);
                return this.switchToPage(ProductsPage.class);

            case REPTILES:

                waitFor(REPTILES_LINK).$(REPTILES_LINK);
                return this.switchToPage(ProductsPage.class);

            case BIRDS:

                waitFor(BIRDS_LINK).$(BIRDS_LINK);
                return this.switchToPage(ProductsPage.class);

            default:
                break;
        }

        return null;
    }
}
