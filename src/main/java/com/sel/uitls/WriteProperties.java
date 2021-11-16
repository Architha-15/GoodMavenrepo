package com.sel.uitls;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import net.bytebuddy.agent.builder.AgentBuilder.Identified.Narrowable;

public class WriteProperties {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		File file = new File("C:\\Users\\Annangi\\workspace\\GoodMaven\\src\\test\\resources\\config.properties");
        FileOutputStream fOutputStream = new FileOutputStream(file);
        properties.setProperty("firstname", "Architha");
        properties.setProperty("lastname", "Gadi");
        properties.setProperty("email", "arc@gmail.com");
        properties.setProperty("phonenumber", "998765432");
        properties.setProperty("country", "India");
        properties.setProperty("state", "Telangana");
        properties.store(fOutputStream,"orangeregpagedetails");
        fOutputStream.close();
        
        
	}

}
