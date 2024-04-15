package daily.best.exercise.service;

import daily.best.exercise.entitiy.Member;
import daily.best.exercise.entitiy.MemberAuthRole;
import daily.best.exercise.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    MemberRepository memberRepository;

    public boolean membersignup(String userid ,String username ,String password ,int birth){ // 회원가입

        Optional<Member> optionalMember = memberRepository.findByUserId(userid);

        //같은아이디로 입력시 기존 아이디가 덮어씌워져 수정
        if (optionalMember.isPresent()) {// 아이디 있으면 실패
            return false;
        } else {// 아이디 없으면 성공
            Member member = Member.builder().userid(userid).userpw(passwordEncoder.encode(password)).username(username).brith(birth).build();
            member.addMemberRole(MemberAuthRole.USER);
            memberRepository.save(member);
            return true;
        }
    }



}
