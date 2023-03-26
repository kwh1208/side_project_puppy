package walkway.project.mapper;

import org.springframework.stereotype.Component;


@Component
public interface TownMapper {
    String findByTown(String city, String town);
}
