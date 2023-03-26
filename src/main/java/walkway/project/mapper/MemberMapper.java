package walkway.project.mapper;

import org.springframework.stereotype.Component;
import walkway.project.controller.members.Member;
@Component
public interface MemberMapper {
    Member save(Member member);

    long findById();
}
