package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import patterns.Promise;

public class GroupPage extends BasePage{

    private static final By TOOLBAR = By.xpath(".//div[@class='toolbar_c']");
    private static final By GROUP_INFORMATION = By.xpath(".//div[@id='hook_Block_LeftColumnTopCardAltGroup']");
    private static final By AVATAR = By.xpath(".//div[@class='entity-avatar']");
    private static final By GROUP_NAME = By.xpath(".//div[@class='mctc_name']");
    private static final By NAVIGATION_MENU = By.xpath(".//div[@class='mctc_navMenu __groups']");

    public GroupPage(WebDriver driver){
        super(driver);
    }

    public GroupPage openPage(String link){
        driver.get(link);
        check(driver);
        return new GroupPage(driver);
    }

    public Promise checkUserStatus() {
        return new Promise(driver);
    }

    @Override
    void check(WebDriver driver) {
        driver.findElement(TOOLBAR);
        driver.findElement(GROUP_INFORMATION);
        driver.findElement(AVATAR);
        driver.findElement(GROUP_NAME);
        driver.findElement(NAVIGATION_MENU);
    }
}
