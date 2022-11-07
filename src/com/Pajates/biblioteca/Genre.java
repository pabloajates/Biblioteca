package com.Pajates.biblioteca;

public class Genre {

    private Integer id;

    private String name;

    private String description;


    public void setId(Integer genreId) {
        id = genreId;
    }

    public Integer getId() {
        return this.id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
