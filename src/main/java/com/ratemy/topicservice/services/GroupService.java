package com.ratemy.topicservice.services;

import com.ratemy.topicservice.entities.Group;
import com.ratemy.topicservice.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {

    @Autowired
    private GroupRepository repository;

    public Optional<Group> getGroupById(Long id) {
        return repository.findById(id);
    }

    public Group updateGroup(Group group) {
        return repository.save(group);
    }

    public Group addGroup(Group group) {
        return repository.save(group);
    }

    public List<Group> finaAllGroups() {
        return repository.findAll();
    }

    public List<Group> findAllGroupsById(List<Long> ids) {
        return repository.findAllById(ids);
    }

    public void deleteGroupById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAllGroupsById(List<Long> ids) {
        repository.deleteAllById(ids);
    }
}
