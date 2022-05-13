package com.ratemy.topicservice.entities;

import javax.persistence.*;

@Entity(name = "Ratings")
public class Rating {
    @Id
    @SequenceGenerator(
            name = "rating_sequence",
            sequenceName = "rating_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rating_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    private Long count;

    public Rating() {
    }

    public Rating(Long count) {
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
