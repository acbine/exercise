package daily.best.exercise.entitiy;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Member {
    @Id
    private String userid;

    private String userpw;

    private String username;

    private LocalDateTime regdate;

    private LocalDateTime updatedate;

    private int brith;

    @PrePersist
    protected void onCreate() {
        this.regdate = LocalDateTime.now(ZoneId.of("Asia/Seoul")); // 현재 날짜로 설정
        this.updatedate = LocalDateTime.now(ZoneId.of("Asia/Seoul")); // 업데이트 날짜도 생성 시점에 설정
    }
    @PreUpdate
    protected void onUpdate() {
        this.updatedate = LocalDateTime.now(ZoneId.of("Asia/Seoul")); // 수정 시점에 업데이트 날짜 설정
    }
}
