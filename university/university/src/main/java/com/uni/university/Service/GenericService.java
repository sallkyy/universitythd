package com.uni.university.Service;

import com.uni.university.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Service
public class GenericService<T,ID> {
    @Autowired
    private JpaRepository<T,ID> repository;

    public List<T> findAll(){
        return repository.findAll();
    }

    public Optional<T> findByID(ID id){
        return repository.findById(id);
    }
}
