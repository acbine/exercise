package daily.best.exercise.entitiy;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;

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


    @ElementCollection(fetch = FetchType.LAZY)//컬렉션을 엔티티 안에 포함시키는데 사용
    @CollectionTable(name = "Member_Auth")
    @Builder.Default //빌더 패턴을 생성할 때, 이 필드의 기본값을 설정  memberAuth를 -> HashSet으로 초기화
    private Set<MemberAuthRole> memberAuth = new HashSet<>();

    public void addMemberRole(MemberAuthRole memberAuthRole){ //MemberAuthRole을 roleSet에 추가하는 메서드
        this.memberAuth.add(memberAuthRole);
    }
}
