package pages;

import com.microsoft.playwright.Page;

public class ProductPage {

    Page page;

    public ProductPage(Page page){
        this.page = page;
    }

    public String getPrice(){

        return page.locator("._30jeq3").first().innerText();
    }

    public void addToCart(){

        page.locator("text=Add to cart").click();
    }
}
