package com.webartist.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Programs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private Boolean isactiv;
    private Boolean ischid;
    private Boolean isold;
    private Integer price;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsactiv() {
        return isactiv;
    }

    public void setIsactiv(Boolean isactiv) {
        this.isactiv = isactiv;
    }

    public Boolean getIschid() {
        return ischid;
    }

    public void setIschid(Boolean ischid) {
        this.ischid = ischid;
    }

    public Boolean getIsold() {
        return isold;
    }

    public void setIsold(Boolean isold) {
        this.isold = isold;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}

