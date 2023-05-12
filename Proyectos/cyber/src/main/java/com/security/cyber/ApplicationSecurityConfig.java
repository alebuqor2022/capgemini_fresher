package com.security.cyber;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// esta clase esta obsoleta
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig implements WebMvcConfigurer {

	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		List<UserDetails> users=new ArrayList<>();
//		users.add(User.withDefaultPasswordEncoder()
//						.username("ale")
//						.password("1234")
//						.roles("USER")
//						.build()
//				);
//		users.add(User.withDefaultPasswordEncoder()
//				.username("admin")
//				.password("1234")
//				.roles("ADMIN")
//				.build()
//		);
//		
//		return new InMemoryUserDetailsManager(users);
//	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		PasswordEncoder encoder=PasswordEncoderFactories.createDelegatingPasswordEncoder();
		final User.UserBuilder userBuilder=User.builder().passwordEncoder(encoder::encode);
		
		UserDetails user=userBuilder.username("ale").password("1234").roles("USER").build();
		UserDetails admin=userBuilder.username("admin").password("1234").roles("USER","ADMIN").build();
		
		return new InMemoryUserDetailsManager(user,admin);
	}
}
