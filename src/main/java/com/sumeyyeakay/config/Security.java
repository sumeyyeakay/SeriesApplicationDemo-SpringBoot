package com.sumeyyeakay.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery(
                        "select email as principal, password as credentails, true from users where email=?")

                .authoritiesByUsernameQuery(
                        "select user_email as principal, authorization_userName as role from user_authorization where user_email=?")
                .passwordEncoder(passwordEncoder()).rolePrefix("R_");
    }

    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests().antMatchers("/seriesDelete", "seriesUpdate=**").hasRole("ADMIN")
               .antMatchers("/series", "/", "/register", "/js/**", "/login", "/css/**", "/webjars/**", "/fetchSeries"
               , "/actors")
               .permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll()
               .defaultSuccessUrl("/series").and().logout().logoutSuccessUrl("/series");
    }

}
