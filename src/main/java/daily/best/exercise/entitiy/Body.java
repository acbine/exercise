package daily.best.exercise.entitiy;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Body {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BNO;

    @OneToOne
    private Member member;

    private String gender;
    private Double height;
    private Double weight;

}
