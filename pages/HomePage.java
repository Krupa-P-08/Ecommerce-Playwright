package pages;

import com.microsoft.playwright.Page;

public class HomePage {

    Page page;

    public HomePage(Page page){
        this.page = page;
    }

    public void searchProduct(String product){

        page.locator("input[name='q']").fill(product);

        page.keyboard().press("Enter");
    }
}
