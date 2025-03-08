package com.uni.university.repository;

import com.uni.university.model.Tutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends GenericRepository<Tutor, Long> {
}
