package daily.best.exercise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){ //스프링 시큐리티에서 제공하는 인증 처리를 위한 구현 중 하나로 메모리에서 사용자의 정보를 저장하고 관리
        UserDetails user = User.builder().username("1111").password(passwordEncoder().encode("1111")).roles("USER").build();
        return new InMemoryUserDetailsManager(user);
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((authorizeHttpRequests)->{
            authorizeHttpRequests.requestMatchers("/**").permitAll();
//            authorizeHttpRequests.requestMatchers("/USER").hasRole("USER");
        });
        httpSecurity.formLogin(Customizer.withDefaults()).logout(Customizer.withDefaults()); // 기본 로그인페이지 기본로그아웃페이지
//        httpSecurity.formLogin(formLogin -> formLogin.loginPage("/aa").permitAll());
                     //커스텀로그인페이지
        return httpSecurity.build();
    }


}
