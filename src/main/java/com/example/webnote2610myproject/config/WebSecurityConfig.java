package com.example.webnote2610myproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers(
                        "/",
                        "/main",
                        "/registration",
                        "/authorization"
                )
                .permitAll()
                .anyRequest()
                .permitAll()
        ;
        //.authorizeRequests()
        //.antMatchers("/", "registration").permitAll()
        // .anyRequest().permitAll()
/*                .and()
                .formLogin()
                .loginPage("authorization")
                .permitAll()
                .and()
                .logout()
                .permitAll()*/


    }
}
