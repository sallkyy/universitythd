package com.uni.university.repository;

import com.uni.university.model.Discipline;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplineRepository extends GenericRepository<Discipline, Long> {
}
