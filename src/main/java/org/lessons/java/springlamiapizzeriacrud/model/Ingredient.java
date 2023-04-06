package org.lessons.java.springlamiapizzeriacrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    //GETTER
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //SETTER
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
