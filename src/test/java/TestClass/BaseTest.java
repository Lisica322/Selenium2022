package TestClass;

import Managers.DriverManager;
import Managers.InitManager;
import Managers.TestManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static Util.Const.BASE_URL;
public class BaseTest {
    private final DriverManager driverManager = DriverManager.getDriverManager();

    protected WebDriver webDriver;

    @BeforeAll
    public static void beforeAll() {
        InitManager.initFramework();
    }

    @BeforeEach
    public void beforeEach() {
        driverManager.getDriver().get(TestManager.getTestManager().getProperty(BASE_URL));
        //  DriverManager.setChromeOptions();
    }
    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
