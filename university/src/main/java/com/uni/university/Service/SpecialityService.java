package com.uni.university.Service;

import com.uni.university.model.Speciality;
import com.uni.university.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService extends GenericService<Speciality,Long> {
    @Autowired
    public SpecialityService(SpecialityRepository repository){
        super(repository);
    }
}
