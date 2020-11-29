package eu.yayi.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true) //  ==> <global-method-security secured-annotations="enabled" />
public class MySecurityConfiguration  extends WebSecurityConfigurerAdapter {


    @Bean
    public BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    // Authentication Provider
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("seyer").password(encoder().encode("password")).roles("USER")  // DaveSayer (Boot co-creator)
                .and()
                .withUser("webb").password(encoder().encode("password")).roles("USER","VIEWER", "EDITOR")   // Phil Webb (Boot co-creator)
                .and()
                .withUser("winch").password(encoder().encode("password")).roles("ADMIN");  // Rob Winch (Boot co-creator)
    }

    // Autorisation rules
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers("/public/**").authenticated()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .and()
                .logout().logoutUrl("/logout");


    }
}
