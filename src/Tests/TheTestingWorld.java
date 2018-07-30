package Tests;

import SeleniumDriver.Driver;
import junit.framework.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TheTestingWorld {
    private static Driver driver;

    @BeforeClass
    public void Initialize()
    {
        driver = new Driver();
        driver.InitializeChromeDriver("http://shop.thetestingworld.com/");
    }

    @Test
    public void VerifyPageTitle()
    {
        System.out.println("Test Launch and Tear Down");
        String pageTitle = driver.webDriver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        Assert.assertTrue(pageTitle.equalsIgnoreCase("Your store"));
    }

    @AfterClass

    public void tearDown()
    {
        driver.webDriver.quit();
    }
}
