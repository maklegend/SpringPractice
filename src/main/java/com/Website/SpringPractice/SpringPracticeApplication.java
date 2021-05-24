package com.Website.SpringPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@ComponentScan(basePackages={"com.Website.SpringPractice"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringPracticeApplication {
	
	@Autowired
	public static ApplicationContext appContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
		
	}
	
	@Component
	static class AppContextInitializr{
		
		@Autowired
		public AppContextInitializr(ApplicationContext context) {
			appContext = context;
			System.out.println(appContext);
		}
		
	}

}
