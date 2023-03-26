package walkway.project.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import walkway.project.controller.coordinate.trail;
import walkway.project.controller.district.District;
import walkway.project.mapper.TrailMapper;

@Controller
@RequestMapping("/walk_with_dog/")
public class TrailController {
    private final District district;
    private final TrailMapper trailMapper;

    public TrailController(District district, TrailMapper trailMapper) {
        this.district = district;
        this.trailMapper = trailMapper;
    }

    @PostMapping("recommend/")
    public String recommend(@RequestParam("city") String city,
                            @RequestParam("town") String town){

        trailMapper.findByDistrict(district.findByTown(city, town));

        trail trail = new trail();
        trail.setName("");
        return null;
    }
}