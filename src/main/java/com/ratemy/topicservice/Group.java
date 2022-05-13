package com.ratemy.topicservice;

import javax.persistence.*;

@Entity(name="Groups")
public class Group {
    @Id
    @SequenceGenerator(
            name="group_sequence",
            sequenceName = "group_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "group_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            updatable = false,
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String title;

    @Column(
            columnDefinition = "TEXT"
    )
    private String info;

    public Group() {
    }

    public Group(String title, String info) {
        this.title = title;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
