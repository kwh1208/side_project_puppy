package walkway.project.controller.district;

import org.springframework.stereotype.Component;
import walkway.project.mapper.TownMapper;

@Component
public class District {
    private final TownMapper townMapper;

    public District(TownMapper townMapper) {
        this.townMapper = townMapper;
    }

    public String findByTown(String city, String town) {
        return townMapper.findByTown(city, town);
    }
}
