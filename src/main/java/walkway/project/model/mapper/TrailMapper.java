package walkway.project.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import walkway.project.dto.Trail;

import java.util.List;

@Mapper
public interface TrailMapper {

    public List<Trail> selectAll();
}
