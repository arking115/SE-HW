package com.example.Project.project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table_two")
public class Table_two {
    @Id
    @SequenceGenerator(
            name = "table_two_uid_seq",
            allocationSize = 1,
            sequenceName = "table_two_uid_seq"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "table_two_uid_seq"
    )
    @Column(name = "uid")
    private long id;
    private String value;

    public Table_two(String value) {
        this.value = value;
    }

    public Table_two() {}

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

    @Override
    public String toString() {
        return "Table_two{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
