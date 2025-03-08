package com.uni.university.repository;

import com.uni.university.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends GenericRepository<Student,Long> {
}
