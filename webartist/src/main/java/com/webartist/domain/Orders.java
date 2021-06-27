package com.webartist.domain;

import  javax.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String date;
    private String time;
    private String adr;
    private String progname;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    public Orders() {
    }

    public Orders(String date, String time, String adr, String progName, User user) {
        this.author = user;
        this.date = date;
        this.time = time;
        this.adr = adr;
        this.progname = progName;
    }

    public String getAuthorName() {
        return author != null ? author.getUsername() : "<none>";
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getProgName() {
        return progname;
    }

    public void setProgName(String progname) {
        this.progname = progname;
    }
}