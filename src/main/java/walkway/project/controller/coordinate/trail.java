package walkway.project.controller.coordinate;

import lombok.Getter;
import org.springframework.stereotype.Component;
import walkway.project.controller.district.District;

@Component
@Getter
public class trail {
    private final String Coordinate;

    public trail(District district) {
        this.Coordinate = null;
        //DB에서 가져온 정보 넣기 "select coordinate from trail where district = (입력된 구);"
    }
}
