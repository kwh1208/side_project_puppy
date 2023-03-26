package walkway.project.controller.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
@RequiredArgsConstructor
@Getter
@Component
@RequestMapping("/walk_with_dog/")
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
    @PostMapping
    public String tmp(@RequestParam("city") String city,
                      @RequestParam("town") String town){

        return null;
    }
}
/*
* 정보 다 받아오기
*
* */
