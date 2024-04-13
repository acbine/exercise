package daily.best.exercise.entitiy;

import jakarta.persistence.*;


@Entity
public class MemberAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mano;

    @ManyToOne
    private Member member;

    private String auth;

}
