package com.uni.university.repository;

import com.uni.university.model.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends GenericRepository<Department, Long>{
}
