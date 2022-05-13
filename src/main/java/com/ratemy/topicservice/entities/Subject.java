package com.ratemy.topicservice.entities;

import javax.persistence.*;

@Entity(name = "Subjects")
public class Subject {
    @Id
    @SequenceGenerator(
            name="subject_sequence",
            sequenceName = "subject_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "subject_sequence"
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
    private String name;
    @Column(
            columnDefinition = "TEXT"
    )
    private String title;
    @Column(
            columnDefinition = "TEXT"
    )
    private String info;
    private Long ratingId;
    private Long reasonId;
    private Long groupId;
    private Long imgId;

    public Subject() {
    }

    public Subject(String name, String title, String info, Long ratingId, Long reasonId, Long groupId, Long imgId) {
        this.name = name;
        this.title = title;
        this.info = info;
        this.ratingId = ratingId;
        this.reasonId = reasonId;
        this.groupId = groupId;
        this.imgId = imgId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public Long getReasonId() {
        return reasonId;
    }

    public void setReasonId(Long reasonId) {
        this.reasonId = reasonId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                ", ratingId=" + ratingId +
                ", reasonId=" + reasonId +
                ", groupId=" + groupId +
                ", imgId=" + imgId +
                '}';
    }
}
