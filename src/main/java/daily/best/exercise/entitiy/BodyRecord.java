package daily.best.exercise.entitiy;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordno;

    @ManyToOne
    private Body body;

    @ManyToOne
    private Exercise exercise;

    private LocalDateTime recorddate;
}
