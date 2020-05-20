package com.fleetManagement.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



//spring security creates a default login logout page
@Configuration
@EnableWebSecurity //tell spring security that this web security configuration to handle web request   
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//set conf to auth object
		
		//tell which type of authentification desired ( chain method pattern)
		auth.inMemoryAuthentication()
		     .withUser("safe")
		     .password("0000")
		     .roles("ADMIN");
	}
	
	//pasword encoder actually does nothing here
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
		
	}

	//config authorization  through httpSecurity object
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//method chaining
		http.authorizeRequests()
		    .antMatchers("/**") //antMatchers to specify the path here all urls
		    .hasRole("ADMIN") //tell that all url should be accessible by users who has admin role hasAnyRole() to specify multiple role
		    .and()
		    .formLogin(); //use form login
		     
		     
	}
	
	
	
	
	
	
	

	/*
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll();//ANY BODY CAN USE THIS 
	}
	
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("safe")
		.password("{noop}password") //no password encoder
		.roles("USER");
	}
	*/
	
}
