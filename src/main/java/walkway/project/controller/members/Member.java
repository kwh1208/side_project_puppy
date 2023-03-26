package walkway.project.controller.members;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class Member {
    private final String Email;//pk
    private final String address;
    private final String nickname;
    private final String dog_name;
    private final Long password;

}
