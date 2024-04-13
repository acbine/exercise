package daily.best.exercise.repository;

import daily.best.exercise.entitiy.BodyRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<BodyRecord, Long> {

}