package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigHandler {
    private static Properties registeartionTestData;
    private static Properties configurationData ;

    public static final String REGISTERATION_DATA_PATH = "resources/config/RegisteartionTestData.properties";
    public static final String CONFIGURATION_DATA_PATH = "resources/config/GeneralData.properties" ;
    public static void setConfigProperties() throws IOException {
        setRegisterationDataProperties() ;

    }

    public static void setRegisterationDataProperties() throws IOException {
        registeartionTestData = new Properties();
        registeartionTestData.load(new FileInputStream(REGISTERATION_DATA_PATH));
    }
    public static void setConfigurationDataProperties() throws IOException {
        registeartionTestData = new Properties();
        registeartionTestData.load(new FileInputStream(CONFIGURATION_DATA_PATH));
    }

    public static Properties getRegisterationDataProperties() {
        return registeartionTestData;
    }
    public static Properties getConfigurationDataProperties(){return configurationData;}
}