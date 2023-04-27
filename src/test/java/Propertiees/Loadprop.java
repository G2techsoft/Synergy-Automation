package Propertiees;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Loadprop {

    public String getdata(String get){
        try {

            File file=new File("C:\\Users\\Balam\\IdeaProjects\\MyFrame\\src\\test\\java\\Propertiees\\Locators.properties");
            FileInputStream fis=new FileInputStream(file);
            Properties properties=new Properties();
          properties.load(fis);
          String data=properties.getProperty(get);

            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
