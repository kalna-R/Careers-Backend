package com.example.demo.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "degrees")
public class Degree {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto increment field
    @Column(name = "degree_id")
    private int degreeId;
    @Column(name = "degree_name")
    private String degreeName;
    @Column(name = "field")
    private String field;
    @Column(name = "jobs")
    private String jobs;

    public Degree() {

    }

    public Degree(int degreeId, String degreeName, String field, String jobs) {
        this.degreeId = degreeId;
        this.degreeName = degreeName;
        this.field = field;
        this.jobs = jobs;
    }

    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

}
