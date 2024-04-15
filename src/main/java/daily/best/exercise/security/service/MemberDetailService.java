package daily.best.exercise.security.service;

import daily.best.exercise.entitiy.Member;
import daily.best.exercise.repository.MemberRepository;
import daily.best.exercise.security.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class MemberDetailService implements UserDetailsService { //MemberDetailService 클래스는 UserDetailsService 인터페이스를 구현

    @Autowired
    MemberRepository memberRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+username);

        Optional<Member> memberOptional = memberRepository.findByUserId(username);
        Member member= memberOptional.get();

        MemberDTO memberDTO = new MemberDTO(member.getUserid(),member.getUserpw(),member.getUsername(),member.getRegdate(),member.getUpdatedate(), member.getBrith(),
                member.getMemberAuth().stream().map( x->new SimpleGrantedAuthority("ROLE_"+x.name()) ).collect(Collectors.toSet())); // 엔티티를 정보를  DTO정보로>

        return memberDTO;
    }
}
