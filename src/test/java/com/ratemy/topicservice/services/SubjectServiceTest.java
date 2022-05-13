package com.ratemy.topicservice.services;

import com.ratemy.topicservice.entities.Subject;
import com.ratemy.topicservice.repositories.SubjectRepository;
import com.ratemy.topicservice.services.SubjectService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SubjectServiceTest {
    @Mock
    private SubjectRepository subjectRepository;
    @InjectMocks
    private SubjectService underTest;

    @Test
    void getAllSubjects() {
        //when
        underTest.finaAllSubjects();
        //then
        verify(subjectRepository).findAll();
    }

    @Test
    void getSubjectById() {
        //when
        underTest.getSubjectById(1l);
        //then
        verify(subjectRepository).findById(1l);
    }

    @Test
    void updateSubject() {
        Subject subject = new Subject();
        //when
        underTest.updateSubject(subject);
        //then
        verify(subjectRepository).save(subject);
    }

    @Test
    void addSubjects() {
        Subject subject = new Subject();
        //when
        underTest.addSubject(subject);
        //then
        verify(subjectRepository).save(subject);
    }

    @Test
    void findAllSubjectsById() {
        List<Long> ids = List.of(1l,2l,3l,4l,5l);
        //when
        underTest.findAllSubjectsById(ids);
        //then
        verify(subjectRepository).findAllById(ids);
    }

    @Test
    void deleteSubjectById() {
        //when
        underTest.deleteSubjectById(1l);
        //then
        verify(subjectRepository).deleteById(1l);
    }

    @Test
    void deleteAllSubjectsById() {
        List<Long> ids = List.of(1l,2l,3l,4l,5l);
        //when
        underTest.deleteAllSubjectsById(ids);
        //then
        verify(subjectRepository).deleteAllById(ids);
    }
}
