package pageobjects;

import org.openqa.selenium.By;

public class AmazonPage {
    public static final By SEARCH_BOX = By.id("twotabsearchtextbox");
    public static final By SEARCH_BUTTON = By.xpath("//input[@id='nav-search-submit-button' and @type='submit']");
    public static final By FIRST_PRICE = By.xpath("(//span[@class='a-offscreen'])[1]");
    public static final By FILTER_BUTTON = By.id("a-autoid-1-announce");
}