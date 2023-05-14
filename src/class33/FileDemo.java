package class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path="Files/Config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);

        Properties properties=new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.get("url"));
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));

        int iterations= Integer.parseInt(properties.getProperty("loop"));
        for (int i=0; i< iterations; i++){
            System.out.println("Dynamic Program");
        }

        // this code will send data to file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.setProperty("name", "NoorUllah Ahmadzai");
        properties.store(fileOutputStream, "added new properties in file");



    }
}
