package daily.best.exercise.repoTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class SecurityTest {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    public void entest(){
        String pw="1234";
        String enpw= passwordEncoder.encode(pw);
        System.out.println(enpw+"+++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
