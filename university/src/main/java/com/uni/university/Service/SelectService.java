package com.uni.university.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Service
public class SelectService<T,ID> {
    @Autowired
    private JpaRepository<T,ID> repository;

    public List<T> findAll(){
        return repository.findAll();
    }

    public Optional<T> findByID(ID id){
        return repository.findById(id);
    }
    public T save(T entity) {
        return repository.save(entity);
    }

    public T update(ID id, Consumer<T> updater) {
        return repository.findById(id)
                .map(entity -> {
                    updater.accept(entity); // Применяем обновления
                    return repository.save(entity);
                })
                .orElseThrow(() -> new RuntimeException("Entity not found with id: " + id));
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
