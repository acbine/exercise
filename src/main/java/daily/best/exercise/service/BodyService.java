package daily.best.exercise.service;

import daily.best.exercise.entitiy.Body;
import daily.best.exercise.entitiy.Member;
import daily.best.exercise.repository.BodyRepository;
import daily.best.exercise.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BodyService {
    @Autowired
    BodyRepository bodyRepository;

    @Autowired
    MemberRepository memberRepository;

    public boolean finduserid(String userid){ // 기록창을 판단하는장치
        Body body = bodyRepository.findByUserId(userid);
        if (body != null) {
            return false;
        } else {
            return true;
        }
    }

    public void bodyregister(String userid,Double height,Double weight,String gender){
        Optional<Member> optionalMember =memberRepository.findByUserId(userid);//가져와서
        Body body = Body.builder().member(optionalMember.get()).height(height).weight(weight).gender(gender).build(); //생성해주고
        bodyRepository.save(body); //저장
    }


}
