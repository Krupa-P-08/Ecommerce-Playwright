package api;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class FlipkartAPITest {

    @Test
    public void apiTest(){

        Playwright playwright = Playwright.create();

        APIRequest request = playwright.request();

        APIRequestContext context = request.newContext();

        APIResponse response = context.get("https://fakestoreapi.com/products");

        System.out.println("Status Code: " + response.status());

        System.out.println(response.text());

        playwright.close();
    }
}
