package com.Website.SpringPractice.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Configuration{
	
	@Autowired
	public Configuration() {
		
	}
	
	@Bean
	public Properties getApplicationProperties(){
		
		Properties properties = new Properties();
		
		try {
			properties.load(new FileReader("AppProperties.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return properties;
	}

}
