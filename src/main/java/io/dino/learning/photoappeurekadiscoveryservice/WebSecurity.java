package io.dino.learning.photoappeurekadiscoveryservice;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // disable cross site request forgery because we dont use ca-cert token and
                // unless we disable it, our microservices will not be able to register with Eureka
                .csrf().disable()
                // ensure any request is authenticated
                .authorizeRequests().anyRequest().authenticated()
                .and()
                // allow user to authenticate using HttpBasic authentication
                .httpBasic();
    }
}
