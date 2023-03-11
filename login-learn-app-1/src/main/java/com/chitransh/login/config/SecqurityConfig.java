package com.chitransh.login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecqurityConfig {
	
	
	  
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/createUser")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin();
//		.defaultSuccessUrl("/emp/")
//		.and()
//		.csrf().disable();
		 
		return httpSecurity.build();
		
//		DefaultSecurityFilterChain defaultSecurityFilterChain = Http.build();
//		
//		return defaultSecurityFilterChain;
	}
	
//	protected void configure (AuthenticationManagerBuilder auth) throws Exception{
//		auth.userDetailsService(this.Customer)
//	}
	
	
	
	@Bean
	public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration configuration) throws Exception{
		return configuration.getAuthenticationManager();
	}
}
