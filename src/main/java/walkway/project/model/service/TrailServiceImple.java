package walkway.project.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkway.project.dto.Trail;
import walkway.project.model.mapper.TrailMapper;

import java.util.List;

@Service
public class TrailServiceImple implements TrailService {

    @Autowired
    private TrailMapper mapper;
    @Override
    public List<Trail> selectAll() {
        return mapper.selectAll();
    }
}