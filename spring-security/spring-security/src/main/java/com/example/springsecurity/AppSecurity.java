//package com.example.springsecurity;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configurable
//@EnableWebSecurity
//public class AppSecurity extends WebSecurityConfigurerAdapter{
//
//	
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin123").authorities("ADMIN");
//		auth.inMemoryAuthentication().withUser("manager").password("{noop}manager123").authorities("MANAGER");
//		auth.inMemoryAuthentication().withUser("emp").password("{noop}emp123").authorities("EMP");
//		auth.inMemoryAuthentication().withUser("sa").password("{noop}sa123").authorities("SUPERADMIN");
//		auth.inMemoryAuthentication().withUser("sv").password("{noop}sv123").authorities("SUPERVISOR");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		http.authorizeRequests()
//		.antMatchers("/home").permitAll()
//		.antMatchers("/welcome").authenticated()
//		.antMatchers("/admin").hasAuthority("ADMIN")
//		.antMatchers("/manager").hasAuthority("MANAGER")
//		.antMatchers("/emp").hasAuthority("EMP")
//		.antMatchers("/sa").hasAuthority("SUPERADMIN")
//		.antMatchers("/sv").hasAuthority("SUPERVISOR")
//		.antMatchers("/mainapp").hasAnyAuthority("ADMIN","SUPERVISOR")
//		.antMatchers("/common").hasAnyAuthority("EMP","MANAGER")
//		.anyRequest().authenticated()
//		.and()
//		.formLogin()
//		.defaultSuccessUrl("/welcome",true)
//		.and()
//		.logout()
//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		.and()
//		.exceptionHandling()
//		.accessDeniedPage("/ad");
//		;
//	}
//	
//}
