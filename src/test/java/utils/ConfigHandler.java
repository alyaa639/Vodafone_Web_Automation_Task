package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigHandler {
    private static Properties generalData ;
    private static Properties registeartionTestData;
    public static final String REGISTERATION_DATA_PATH = "resources/config/RegisteartionTestData.properties";
    public static final String GENERAL_DATA_PATH = "resources/config/GeneralData.properties" ;
    public static void setConfigProperties() throws IOException {
        setRegisterationDataProperties() ;

    }

    public static void setRegisterationDataProperties() throws IOException {
        registeartionTestData = new Properties();
        registeartionTestData.load(new FileInputStream(REGISTERATION_DATA_PATH));
    }
    public static void setGeneralDataProperties() throws IOException {
        registeartionTestData = new Properties();
        registeartionTestData.load(new FileInputStream(GENERAL_DATA_PATH));
    }

    public static Properties getRegisterationDataProperties() {
        return registeartionTestData;
    }
    public static Properties getGeneralDataProperties(){return generalData;}
}