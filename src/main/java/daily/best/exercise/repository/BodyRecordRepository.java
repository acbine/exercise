package daily.best.exercise.repository;

import daily.best.exercise.entitiy.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodyRecordRepository extends JpaRepository<Exercise, Long> {

}