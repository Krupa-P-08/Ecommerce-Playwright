package pages;

import com.microsoft.playwright.Page;

public class SearchPage {

    Page page;

    public SearchPage(Page page){
        this.page = page;
    }

    public void applyBrandFilter(String brand){

        page.locator("text=" + brand).click();
    }

    public void selectFirstProduct(){

        page.locator("._1fQZEK").first().click();
    }
}
