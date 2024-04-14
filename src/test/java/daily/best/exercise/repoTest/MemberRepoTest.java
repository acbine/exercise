package daily.best.exercise.repoTest;

import daily.best.exercise.entitiy.Member;
import daily.best.exercise.entitiy.MemberAuthRole;
import daily.best.exercise.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

@SpringBootTest
public class MemberRepoTest {
    @Autowired
    MemberRepository memberRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    public void mrTest(){ //SpringSecu+name
//        System.out.println("++++++++++++++++++++"+LocalDateTime.now(ZoneId.of("Asia/Seoul")));
        Member member = Member.builder().userid("3333").userpw(passwordEncoder.encode("3333")).username("3333").brith(12345678).build();
        member.addMemberRole(MemberAuthRole.USER);
        member.addMemberRole(MemberAuthRole.ADMIN);
        member.addMemberRole(MemberAuthRole.MANAGER);
        memberRepository.save(member);
    }

    @Test
    public void mfindTest(){ //SpringSecu+name
//        System.out.println("++++++++++++++++++++"+LocalDateTime.now(ZoneId.of("Asia/Seoul")));
        Optional<Member> memberOptional = memberRepository.findByUserId("3333");
        Member member= memberOptional.get();
        System.out.println(member);
    }

}
