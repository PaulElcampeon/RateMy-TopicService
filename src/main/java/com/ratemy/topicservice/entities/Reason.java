package com.ratemy.topicservice.entities;


import javax.persistence.*;

@Entity(name = "Reasons")
public class Reason {
    @Id
    @SequenceGenerator(
            name="reason_sequence",
            sequenceName = "reason_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reason_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    private String message;

    private Long groupId;

    private Long subjectId;

    public Reason() {
    }

    public Reason(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }
}
