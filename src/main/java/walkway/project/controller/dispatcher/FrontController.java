package walkway.project.controller.dispatcher;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
@Component
@RequiredArgsConstructor
@Getter
public class FrontController {
    private final boolean authentication;
    private final String town;
    private final String location;
    private final String city;
    @Autowired
    public FrontController(HttpServletRequest request) {
        this.authentication = Boolean.parseBoolean(request.getParameter("Authentication"));
        this.town = request.getParameter("town");
        this.location = request.getParameter("location");
        this.city = request.getParameter("city");//로케이션으로 받아오는 경우에만.
    }
}
/*
* 정보 다 받아오기
*
* */
