package testClass;

import managers.DriverManager;
import managers.InitManager;
import managers.PageManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import util.Const;

public class BaseTest {
    protected PageManager app = PageManager.getPageManager();

    private final DriverManager driverManager = DriverManager.getDriverManager();

    protected WebDriver webDriver;

    private static final String MICRO_GREEN_URL = Const.microGreenURL.BASE_URL.getBaseUrl();

    @BeforeAll
    public static void beforeAll() {
        InitManager.initFramework(MICRO_GREEN_URL);
    }

    @AfterAll
    public static void afterAll() {
        InitManager.quitFramework();
    }
}
