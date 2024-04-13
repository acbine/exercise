package daily.best.exercise.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class BodyRecord {

    @Id
    private Long recordno;

    @ManyToOne
    private Body body;

    @ManyToOne
    private Exercise exercise;

    private LocalDateTime recorddate;
}
