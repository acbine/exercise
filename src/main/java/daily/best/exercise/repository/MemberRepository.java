package daily.best.exercise.repository;

import daily.best.exercise.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {

}