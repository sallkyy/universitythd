package com.uni.university.Service;

import com.uni.university.model.Stgroup;
import com.uni.university.repository.StgroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StgroupService extends GenericService<Stgroup,Long> {
    @Autowired
    public StgroupService(StgroupRepository repository) {
        super(repository);
    }
}
