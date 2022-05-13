package com.ratemy.topicservice;


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
}
