package daily.best.exercise.security.dto;

import daily.best.exercise.entitiy.Member;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class BodyDTO {


    private Long BNO;

    private Member member;

    private String gender;
    private Double height;
    private Double weight;
}
