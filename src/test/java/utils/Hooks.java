package utils;
import base.TestBase;
import io.cucumber.java.Before;
import java.io.IOException;
import java.net.MalformedURLException;

public class Hooks extends TestBase {
    @Before(order = 0)
    public void beforeAll() throws IOException {

        ConfigHandler.setConfigProperties();
        registeartionTestData = ConfigHandler.getRegisterationDataProperties();


    }

    @Before(order = 1)
    public void setUp() throws MalformedURLException {
        driverSetUp() ;
        System.out.println("driver is being called...");
    }
}
