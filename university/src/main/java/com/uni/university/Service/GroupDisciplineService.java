package com.uni.university.Service;

import com.uni.university.model.GroupDiscipline;
import com.uni.university.repository.GroupDisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupDisciplineService extends GenericService<GroupDiscipline,Long> {
    @Autowired
    public GroupDisciplineService(GroupDisciplineRepository repository){
        super(repository);
    }
}
