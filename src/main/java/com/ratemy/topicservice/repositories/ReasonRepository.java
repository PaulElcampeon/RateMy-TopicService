package com.ratemy.topicservice.repositories;

import com.ratemy.topicservice.entities.Reason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReasonRepository extends JpaRepository<Reason, Long> {
}
