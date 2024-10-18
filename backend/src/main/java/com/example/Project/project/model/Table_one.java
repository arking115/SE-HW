package com.example.Project.project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_one")
public class Table_one {
    @Id
    @SequenceGenerator(
            name = "table_one_uid_seq",
            allocationSize = 1,
            sequenceName = "table_one_uid_seq"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "table_one_uid_seq"
    )
    @Column(name = "uid")
    private long id;
    private String value;

    public Table_one(long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Table_one(String value) {
        this.value = value;
    }

    public Table_one() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
