package com.sel.uitls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Properties;

public class ReadProperties {

	public static  ArrayList<Object[]> readProperties() throws Exception {
		Properties properties = new Properties();
		File file = new File("C:\\Users\\Annangi\\workspace\\GoodMaven\\src\\test\\resources\\config.properties");
      FileInputStream fileInputStream = new FileInputStream(file);
      properties.load(fileInputStream);
      ArrayList<Object[]> myData = new ArrayList<Object[]>();
     String firstname = properties.getProperty("firstname");
     String lastname =  properties.getProperty("lastname");
     String email = properties.getProperty("email");
     String phonenumber =properties.getProperty("phonenumber");
     String country = properties.getProperty("country");
     String state= properties.getProperty("state");
     Object ob[]= {firstname,lastname,email,phonenumber,country,state};
		myData.add(ob);
      
      fileInputStream.close();
	return myData;
       
	}

}
