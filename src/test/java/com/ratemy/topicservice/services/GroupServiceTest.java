package com.ratemy.topicservice.services;

import com.ratemy.topicservice.entities.Group;
import com.ratemy.topicservice.repositories.GroupRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class GroupServiceTest {
    @Mock
    private GroupRepository groupRepository;
    @InjectMocks
    private GroupService underTest;

    @Test
    void getGroupById() {
        //when
        underTest.getGroupById(1l);
        //then
        verify(groupRepository).findById(1l);
    }

    @Test
    void updateGroup() {
        Group group = new Group();
        //when
        underTest.updateGroup(group);
        //then
        verify(groupRepository).save(group);
    }

    @Test
    void addGroup() {
        Group group = new Group();
        //when
        underTest.addGroup(group);
        //then
        verify(groupRepository).save(group);
    }

    @Test
    void getAllGroupsById() {
        List<Long> ids = List.of(1l, 2l, 3l, 4l, 5l);
        //when
        underTest.findAllGroupsById(ids);
        //then
        verify(groupRepository).findAllById(ids);
    }

    @Test
    void deleteGroupsById() {
        //when
        underTest.deleteGroupById(1l);
        //then
        verify(groupRepository).deleteById(1l);
    }

    @Test
    void deleteAllGroupsById() {
        List<Long> ids = List.of(1l, 2l, 3l, 4l, 5l);
        //when
        underTest.deleteAllGroupsById(ids);
        //then
        verify(groupRepository).deleteAllById(ids);
    }
}
