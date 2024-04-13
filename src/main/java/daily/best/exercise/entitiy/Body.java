package daily.best.exercise.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Body {

    @Id
    private Long BNO;

    @OneToOne
    private Member member;

    private String gender;
    private Double height;
    private Double weight;

}
