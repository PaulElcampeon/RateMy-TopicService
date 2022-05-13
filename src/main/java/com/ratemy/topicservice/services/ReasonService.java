package com.ratemy.topicservice.services;

import com.ratemy.topicservice.entities.Reason;
import com.ratemy.topicservice.repositories.ReasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReasonService {

    @Autowired
    private ReasonRepository repository;

    public Optional<Reason> getReasonById(Long id) {
        return repository.findById(id);
    }

    public Reason updateReason(Reason reason) {
        return repository.save(reason);
    }

    public Reason addReason(Reason reason) {
        return repository.save(reason);
    }

    public List<Reason> finaAllReasons() {
        return repository.findAll();
    }

    public List<Reason> findAllReasonsById(List<Long> ids) {
        return repository.findAllById(ids);
    }

    public void deleteReasonById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAllReasonsById(List<Long> ids) {
        repository.deleteAllById(ids);
    }
}
