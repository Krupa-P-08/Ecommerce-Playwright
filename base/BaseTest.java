package base;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    @BeforeMethod
    public void setup(){

        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false));

        context = browser.newContext();

        page = context.newPage();

        page.navigate("https://www.flipkart.com/");
    }

    @AfterMethod
    public void tearDown(){

        browser.close();
        playwright.close();
    }
}
