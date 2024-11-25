package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class mainPageSearch {
    public mainPageSearch(){PageFactory.initElements(Driver.getDriver(),this);}
    public final By clickSearchButton = By.xpath("//div[@class='elementor-widget-cmsmasters-search__popup-trigger-inner']");
    public final By searchInput = By.xpath("//input[@placeholder='Keşfet...']");
    public final By eighthPage = By.xpath("//article[8]");


}
