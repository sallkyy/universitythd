package com.uni.university.Service;

import com.uni.university.model.Control;
import com.uni.university.repository.ControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControlService extends GenericService<Control, Long>{

    @Autowired
    public ControlService(ControlRepository repository){
        super(repository);
    }
}
