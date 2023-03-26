package walkway.project.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import walkway.project.controller.members.Member;
import walkway.project.mapper.MemberMapper;

@Controller
@RequestMapping("/walk_with_dog/")
public class MemberController {
    private final MemberMapper memberMapper;

    public MemberController(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @PostMapping("join/")
    public String join(@RequestParam("email") String email,
                       @RequestParam("address") String address,
                       @RequestParam("nickname") String nickname,
                       @RequestParam("dog_name") String dog_name,
                       @RequestParam("password") Long password){

        Member member = new Member(email, address, nickname, dog_name, password);

        memberMapper.save(member);

        return "redirect:/join/complete";
    }

}
