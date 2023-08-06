package com.paung.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "person", schema = "public")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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

    @Column
    private String name;

    public PersonEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public PersonEntity() {
    }


}
