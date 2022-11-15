package Managers;

import java.util.Properties;


public class TestManager {

    private final Properties properties = new Properties();


    private static TestManager INSTANCE = null;



    public  static TestManager getTestManager(){
        if (INSTANCE == null){
            INSTANCE = new TestManager();
        }
        return INSTANCE;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
