package project_2NHABER;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.xpath;

public class pageTest {
    WebDriver driver = new ChromeDriver();
    public static String loginUrl = "https://2nhaber.com/";

    @Before
    public void setUp() {

        try {

            System.setProperty("webdriver.chrome.driver", "https://2nhaber.com/");

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            //dynamic wait
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void login() {

        try {

            driver.get(loginUrl);

            driver.findElement(xpath("//input[@name='username']")).sendKeys("testdenemesi");
            sleep(5000);

            driver.findElement(xpath("//input[@name='password']")).sendKeys("123456");
            sleep(5000);

            driver.findElement(xpath("//div[contains(text(),'Log In')]")).click();
            sleep(5000);

            driver.quit();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @After
    public void tearDown() throws Exception {

    }
}
