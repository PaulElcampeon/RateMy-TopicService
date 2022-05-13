package com.ratemy.topicservice.services;

import com.ratemy.topicservice.entities.Reason;
import com.ratemy.topicservice.repositories.ReasonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ReasonServiceTest {
    @Mock
    private ReasonRepository reasonRepository;
    @InjectMocks
    private ReasonService underTest;

    @Test
    void getReasonById() {
        //when
        underTest.getReasonById(1l);
        //then
        verify(reasonRepository).findById(1l);
    }

    @Test
    void updateReason() {
        Reason reason = new Reason();
        //when
        underTest.updateReason(reason);
        //then
        verify(reasonRepository).save(reason);
    }

    @Test
    void addReasons() {
        Reason reason = new Reason();
        //when
        underTest.addReason(reason);
        //then
        verify(reasonRepository).save(reason);
    }

    @Test
    void getAllReasonsById() {
        List<Long> ids = List.of(1l,2l,3l,4l,5l);
        //when
        underTest.findAllReasonsById(ids);
        //then
        verify(reasonRepository).findAllById(ids);
    }

    @Test
    void deleteReasonById() {
        //when
        underTest.deleteReasonById(1l);
        //then
        verify(reasonRepository).deleteById(1l);
    }

    @Test
    void deleteAllSubjectsById() {
        List<Long> ids = List.of(1l,2l,3l,4l,5l);
        //when
        underTest.deleteAllReasonsById(ids);
        //then
        verify(reasonRepository).deleteAllById(ids);
    }
}
