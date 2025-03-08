package com.uni.university.Service;

import com.uni.university.model.Student;
import com.uni.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends GenericService<Student, Long>{
    @Autowired
    public StudentService(StudentRepository repository){
        super(repository);
    }
}
