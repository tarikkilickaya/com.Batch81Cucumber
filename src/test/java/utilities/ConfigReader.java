package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static { // Her methoddan önce çalışır
        String dosyaYolu = "configurations.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis); // fis'in okuduğu bilgileri properties'e yükler.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getProperty(String key) {

        /*
        Test methodundan yolladığımız String key değerini alıp
        Properties classından getProperty methodunu kullanarak
        bu key'e ait value'yu getirir.
         */

        return properties.getProperty(key);
    }
}