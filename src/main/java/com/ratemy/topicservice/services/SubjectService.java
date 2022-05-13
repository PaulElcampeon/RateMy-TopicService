package com.ratemy.topicservice.services;

import com.ratemy.topicservice.entities.Subject;
import com.ratemy.topicservice.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository repository;

    public Optional<Subject> getSubjectById(Long id) {
        return repository.findById(id);
    }

    public Subject updateSubject(Subject subject) {
        return repository.save(subject);
    }

    public Subject addSubject(Subject subject) {
        return repository.save(subject);
    }

    public List<Subject> finaAllSubjects() {
        return repository.findAll();
    }

    public List<Subject> findAllSubjectsById(List<Long> ids) {
        return repository.findAllById(ids);
    }

    public void deleteSubjectById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAllSubjectsById(List<Long> ids) {
        repository.deleteAllById(ids);
    }
}
