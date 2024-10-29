package utils;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.io.IOException;

public class Hooks extends TestBase {
    @Before
    public void setUp() throws IOException {
        driverSetUp() ;
        System.out.println("driver is being called...");
    }
    @After
    public void tearDown(){
        quitDriver();
    }
}
