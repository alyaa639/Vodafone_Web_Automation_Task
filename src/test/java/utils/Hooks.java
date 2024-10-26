package utils;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.io.IOException;

public class Hooks extends TestBase {
    @Before(order =1 )
    public void beforeAll() throws IOException {
        ConfigHandler.setConfigProperties();
    }
    @Before(order = 0)
    public void setUp() throws IOException {
        driverSetUp() ;
        System.out.println("driver is being called...");
    }
    @After(order=0)
    public void tearDown(){
        quitDriver();
    }
}
