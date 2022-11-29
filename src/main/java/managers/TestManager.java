package managers;

import java.util.Properties;


public class TestManager {

    private static TestManager INSTANCE = null;



    public  static TestManager getTestManager(){
        if (INSTANCE == null){
            INSTANCE = new TestManager();
        }
        return INSTANCE;
    }
}
