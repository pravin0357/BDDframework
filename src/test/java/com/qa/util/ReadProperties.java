package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Asus
 *
 */
public class ReadProperties {

	public static Properties loadProperties() {

		// Open the File
		
		 File objfile = new File("AppConfig/config.properties");

		// Read the File
		FileInputStream objfis = null;

		try {

			objfis = new FileInputStream(objfile);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();

		}
		Properties objprop = new Properties();

		try {

			objprop.load(objfis);

		} catch (IOException e) {

			e.printStackTrace();

		}

		return objprop;
	}

	public static String getappURL() throws IOException {

		return loadProperties().getProperty("appURL");

	}

	public static String getappUserName() {

		return loadProperties().getProperty("userName");

	}

	/**
	 * @return
	 * This will read password from config file
	 */
	public static String getAppPassword() {

		return loadProperties().getProperty("password");

	}

	public static String getAppUserName() {

		return loadProperties().getProperty("userName");

	}

	public static long implicitWaitTime() {

		return Long.parseLong(loadProperties().getProperty("implicitWaitTime"));

	}
	
	/**
	 * @return
	 * this will return fluent wait
	 */
	public static long getFluentWaitTime() {

		return Long.parseLong(loadProperties().getProperty("fluentWaitTime"));

	}
}
