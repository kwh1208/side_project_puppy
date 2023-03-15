package walkway.project.controller.district;

import lombok.Getter;
import org.springframework.stereotype.Component;
import walkway.project.controller.dispatcher.FrontController;

@Component
@Getter
public class District {
    private final String disStrict;
    FrontController frontController;

    public District() {
        this.disStrict = null;
        //db에서 가져온 정보 넣기"select district from matching_town where town = (입력된 마을);"
    }
}