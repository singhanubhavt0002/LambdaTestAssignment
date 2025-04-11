package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageobjects.AmazonPage;
import utils.TestData;

public class StandaloneTest extends BaseTest {

    @Test(dataProvider = "mobileData", dataProviderClass = TestData.class)
    public void test1(String mobile){
        getDriver().findElement(AmazonPage.SEARCH_BOX).sendKeys(mobile);
        getDriver().findElement(AmazonPage.SEARCH_BUTTON).click();

        WebElement element = getDriver().findElement(AmazonPage.FILTER_BUTTON);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        WebElement firstPriceElement = getDriver().findElement(AmazonPage.FIRST_PRICE);
        String price = firstPriceElement.getAttribute("innerText");
        System.out.println("Mobile price: " + price + " | Thread: " + Thread.currentThread().getId());

        element.click();
    }
}
