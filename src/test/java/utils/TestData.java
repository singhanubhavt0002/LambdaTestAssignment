package utils;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "mobileData",parallel = true)
    public Object[][] getMobileData() {
        return new Object[][]{
                {"iPhone 13"},
                {"Samsung Galaxy"},
        };
    }
}
