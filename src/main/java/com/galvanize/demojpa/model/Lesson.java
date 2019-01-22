package com.galvanize.demojpa.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="lesson")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    @Column(columnDefinition = "date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date deliveredOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDeliveredOn() {
        return deliveredOn;
    }

    public void setDeliveredOn(Date deliveredOn) {
        this.deliveredOn = deliveredOn;
    }
}
