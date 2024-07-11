package com.example.student.product.domain;

public class Product {
    private Long id;
    private String name;
    public Product(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
