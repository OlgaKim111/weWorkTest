package weworktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class WeWork {
    WebDriver driver;

   boolean acceptNextAlert = true;
   StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/andrejkim/IdeaProjects/testselenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void tesfindEl2() throws Exception {
        driver.get("https://www.wework.com/ru-RU/");
        driver.findElement(By.xpath("//a[@href='/ru-RU/locations']")).click();
        driver.findElement(By.linkText("Даллас/Форт-Уэрт")).click();
        driver.findElement(By.name("desired_capacity")).click();
        driver.findElement(By.name("desired_capacity")).clear();
        driver.findElement(By.name("desired_capacity")).sendKeys("10");
        //driver.findElement(By.xpath("//div[@id='wework']/div/div[2]/main/form/div/div/div/div/div[2]/div/div/div/div/label/span")).click();
        driver.findElement(By.xpath("//span[@class='sc-bwzfXH uTxCW'][contains(text(),'В этом месяце')]"));
        driver.findElement(By.xpath("//div[@id='wework']/div/div[2]/main/form/div/div/div/div/div[3]/div/div/div/div/div")).click();
        driver.findElement(By.xpath("//div[@id='wework']/div/div[2]/main/form/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/label")).click();
        driver.findElement(By.xpath("//div[@id='wework']/div/div[2]/main/form/div/div/div/div/div[4]/div/button/span")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Снять фильтры')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Инвесторы')]")).click();

    }
    /*

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }


    }
    */

}