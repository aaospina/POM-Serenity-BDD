package com.jpetstore.steps;

import com.jpetstore.pages.*;
import com.jpetstore.utils.PetCategories;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PetStoreSteps extends ScenarioSteps {

    BasePage basePage;

    @Step("Navigate to Sign Page")
    public LoginPage navigateToSignOnPage() {

        return basePage.navigateToSignOnPage();
    }

    @Step("click on Sign on Link")
    public LoginPage clickOnSignOnLink() {

        return basePage.clickOnSignOnLink();
    }

    @Step("Navigate to Dashboard")
    public DashBoardPage navigateToDashBoard() {

        return basePage.navigateToDashBoard();
    }

    @Step("Signing out from the store")
    public DashBoardPage signOut() {

        return basePage.signOut();
    }

    @Step("navigate to Account Page")
    public AccountsPage navigateToAccountPage() {

        return basePage.navigateToAccountPage();
    }

    @Step("search for product")
    public ProductsPage searchForProduct(String searchValue) {

        return basePage.searchForProduct(searchValue);
    }

    @Step("Navigate to Help Page")
    public HelpPage navigateToHelpPage() {

        return basePage.navigateToHelpPage();
    }

    @Step("Navigate to Shopping Cart")
    public ProductsPage navigateToShoppingCart() {

        return basePage.navigateToShoppingCart();
    }

    @Step("Navigate to product category")
    public ProductsPage navigateToProductCategory(PetCategories productCategory) {

        return basePage.navigateToProductCategory(productCategory);
    }

}
