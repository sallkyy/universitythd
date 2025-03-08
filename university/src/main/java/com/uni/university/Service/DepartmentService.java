package com.uni.university.Service;

import com.uni.university.model.Department;
import com.uni.university.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends GenericService<Department, Long> {
    @Autowired
    public DepartmentService(DepartmentRepository repository){
        super(repository);
    }

}
