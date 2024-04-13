package daily.best.exercise.repository;

import daily.best.exercise.entitiy.MemberAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberAuthRepository extends JpaRepository<MemberAuth, Long> {

}