package daily.best.exercise.security.dto;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.time.LocalDateTime;
import java.util.Collection;

@Getter
@Setter
@ToString
public class MemberDTO extends User { //스프링시큐리티의 USER 클래스를 상속

    private String userid;
    private String userpw;
    private String username;
    private LocalDateTime regdate;
    private LocalDateTime updatedate;
    private int brith;

    public MemberDTO(String username, String password,String userNickname,LocalDateTime regdate,LocalDateTime updatedate,int brith, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities); //자식 클래스 MemberDTO가 부모 클래스인 User의 생성자를 호출하는 코드
        this.userid=username;
        this.username=userNickname;
        this.regdate=regdate;
        this.updatedate=updatedate;
        this.brith =brith;
    }

}
