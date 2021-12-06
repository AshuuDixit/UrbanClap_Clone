package com.spring.UrbanClap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		// spring jdbc=> jdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/UrbanClap/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

// insert query
		String query="insert into users(user_id,user_name,user_password,phone) values(?,?,?,?)";
		
	// fire query
		int result = template.update(query,123,"Ashu","1234","23456789");
		System.out.println("User's record inserted successfully"+result);
	}

}
