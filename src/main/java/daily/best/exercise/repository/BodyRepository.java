package daily.best.exercise.repository;

import daily.best.exercise.entitiy.Body;
import daily.best.exercise.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BodyRepository extends JpaRepository<Body, Long> {

    @Query("select b from Body b where b.id = :id")
    Body findByUserId(@Param("id") String id);

}