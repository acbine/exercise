package daily.best.exercise.repository;

import daily.best.exercise.entitiy.Member;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {

    @EntityGraph(attributePaths = {"memberAuth"}, type = EntityGraph.EntityGraphType.LOAD)
    @Query("select m from Member m where m.id = :id")
    Optional<Member> findByUserId(@Param("id") String id);

}