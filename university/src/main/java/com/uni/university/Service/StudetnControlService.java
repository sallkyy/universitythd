package com.uni.university.Service;

import com.uni.university.model.StudentControl;
import com.uni.university.repository.StudentControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudetnControlService extends GenericService<StudentControl,Long> {
    @Autowired
    public StudetnControlService(StudentControlRepository repository){
        super(repository);
    }
}
