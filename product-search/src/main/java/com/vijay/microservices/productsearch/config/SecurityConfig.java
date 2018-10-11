package com.vijay.microservices.productsearch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
public class SecurityConfig  {

	/*
	@Override
	protected void configure(HttpSecurity security) throws Exception {
		security.httpBasic().disable();
		
		security
		//.authorizeRequests().antMatchers("/").permitAll().and()
        .authorizeRequests().antMatchers("/console/**").permitAll();

		security.csrf().disable();
		security.headers().frameOptions().disable();
		
		//below line is to make http://localhost:8080/console/ enable
		security.headers().frameOptions().disable();

	}
	*/
}
