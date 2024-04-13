package daily.best.exercise.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Exercise {
    @Id
    private String sprot;
    private Double cal;
}
