package walkway.project.mapper;

import org.springframework.stereotype.Component;

@Component
public interface TrailMapper {
    String findByDistrict(String district);//좌표
}