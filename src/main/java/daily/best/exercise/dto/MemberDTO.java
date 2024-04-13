package daily.best.exercise.dto;

import lombok.*;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {
    private String userid;
    private String userpw;
    private String username;
    private LocalDateTime regdate;
    private LocalDateTime updatedate;
    private int brith;
}
