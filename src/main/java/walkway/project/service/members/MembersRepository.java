package walkway.project.service.members;

import lombok.Data;

@Data
public class MembersRepository {
    //회원정보 저장
    private Long id;
    private String name;
    private String nickname;

    public MembersRepository(Long id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }
}
