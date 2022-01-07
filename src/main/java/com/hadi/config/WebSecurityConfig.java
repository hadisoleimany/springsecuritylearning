package com.hadi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("password" + new BCryptPasswordEncoder().encode("123").toString());
        auth.inMemoryAuthentication().withUser("hadi").password("$2a$10$qLBgjIwTSWOTrsaworVXI.VD0ywaLPmXlojIFUHyBe5iKH6prAWSW").roles("admin");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/hi").authenticated()//should log in
                .antMatchers("/bye").authenticated()//should log in
                .antMatchers("/").permitAll()//shouldn't log in
                .and()
                .formLogin().loginPage("/customLogInPage")//add custom form Login
                .and()
                .httpBasic()
                .and()
                .logout();
    }

    @Bean
    PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

