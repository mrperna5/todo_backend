package com.perna.rest.basic.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth  {
	
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http
		.csrf().disable()
//		.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
//		.authorizeRequests((requests) -> requests
		.authorizeRequests()
				.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
				.anyRequest().authenticated()
				.and()
//		http.formLogin();
		.httpBasic();
		
		return http.build();
	}

}
