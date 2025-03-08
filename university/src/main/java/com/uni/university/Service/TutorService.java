package com.uni.university.Service;

import com.uni.university.model.Tutor;
import com.uni.university.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorService extends GenericService<Tutor, Long>{
    @Autowired
    public TutorService(TutorRepository repository){
        super(repository);
    }
}
