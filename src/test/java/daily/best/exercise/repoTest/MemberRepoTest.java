package daily.best.exercise.repoTest;

import daily.best.exercise.entitiy.Member;
import daily.best.exercise.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@SpringBootTest
public class MemberRepoTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void mrTest(){
//        System.out.println("++++++++++++++++++++"+LocalDateTime.now(ZoneId.of("Asia/Seoul")));
        Member member = Member.builder().userid("ccc").userpw("bbb").username("ccc").brith(19990918).build();
        memberRepository.save(member);
    }

}
