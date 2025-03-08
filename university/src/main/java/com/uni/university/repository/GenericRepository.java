package com.uni.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository<T, ID> extends JpaRepository<T,ID> {
}
