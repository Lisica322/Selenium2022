package managers;

import java.time.Duration;

public class InitManager {


    private static final DriverManager driverManager = DriverManager.getDriverManager();

    public static void initFramework(String url) {
        driverManager.getDriver().get(url);
        driverManager.getDriver().manage().window().maximize();
        driverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driverManager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
    public static void quitFramework() {
        driverManager.quitDriver();
    }
}


