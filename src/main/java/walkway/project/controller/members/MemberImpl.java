package walkway.project.controller.members;

import lombok.Getter;
import org.springframework.stereotype.Component;
import walkway.project.controller.dispatcher.FrontController;

@Component
@Getter
public class MemberImpl implements Member{
    boolean authentication;

    public MemberImpl(FrontController frontController) {
        this.authentication = frontController.isAuthentication();
    }

}
