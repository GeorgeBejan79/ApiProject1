import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {
    private  static Properties properties;

    public static String getProperty(String key, String isNegative){
        String path;
        if(isNegative.equals("pos")){
            path="src/test/info.properties/info.properties";
        }else{
            path="src/test/info.properties/Infonegative.properties";
        }
        try{
            FileInputStream inputStream= new FileInputStream(path);
            properties =new Properties();
            properties.load(inputStream);
        }catch(Exception e) {
        e.printStackTrace();}

        return properties.getProperty(key);
    }
}
