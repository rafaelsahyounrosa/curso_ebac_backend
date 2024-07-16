package br.rafaelrosa.semana1.crudcidades.cidade;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

//    @Bean
//    public InMemoryUserDetailsManager configure(){
//        UserDetails john = User.withUsername("john")
//                .password(cifrador().encode("test123"))
//                .roles("listar")
//                .build();
//
//        UserDetails anna = User.withUsername("anna")
//                .password(cifrador().encode("test123"))
//                .roles("admin")
//                .build();
//
//                UserDetails admin = User.withUsername("admin")
//                .password(cifrador().encode("admin"))
//                .roles("admin")
//                .build();
//
//        return new InMemoryUserDetailsManager(john, anna, admin);
//    }

    @Bean
    public PasswordEncoder cifrador(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filter(HttpSecurity http) throws Exception{
        return http
                .csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/").hasAnyRole("listar", "admin")
                .requestMatchers("/criar", "/alterar", "/excluir", "/preparaAlterar").hasRole("admin")
                .requestMatchers("/mostrar").authenticated()
                .anyRequest().denyAll()
                .and()
                .formLogin()
                .loginPage("/login.html").permitAll()
                .and()
                .logout().permitAll()
                .and()
                .build();
    }

    @EventListener(ApplicationReadyEvent.class)
    public void printSenhas(){
        System.out.println(this.cifrador().encode("teste123"));
        System.out.println("++++++++++++++++++++ ADMIN +++++++++++++++++++++++");
        System.out.println(this.cifrador().encode("admin"));
    }

    @EventListener(InteractiveAuthenticationSuccessEvent.class)
    public void printUsuarioAtual(InteractiveAuthenticationSuccessEvent event){

        var usuario = event.getAuthentication().getName();

        System.out.println(usuario);
    }
}
