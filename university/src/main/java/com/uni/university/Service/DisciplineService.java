package com.uni.university.Service;

import com.uni.university.model.Discipline;
import com.uni.university.repository.DisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplineService extends GenericService<Discipline,Long> {
    @Autowired
    public DisciplineService(DisciplineRepository repository){
        super(repository);
    }
}
