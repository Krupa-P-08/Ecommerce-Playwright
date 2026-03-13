package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;
import utils.ScreenshotUtil;

public class FlipkartTest extends BaseTest {

    @Test
    public void flipkartAutomation(){

        HomePage home = new HomePage(page);

        home.searchProduct("Samsung Mobile");

        SearchPage search = new SearchPage(page);

        search.applyBrandFilter("Samsung");

        search.selectFirstProduct();

        ProductPage product = new ProductPage(page);

        String price = product.getPrice();

        System.out.println("Product Price: " + price);

        product.addToCart();

        ScreenshotUtil.capture(page,"product");
    }
}
