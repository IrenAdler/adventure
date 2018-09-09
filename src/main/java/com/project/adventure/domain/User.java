package com.project.adventure.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer idUser;
    private String nameUser;
    private String emailUser;

    public User(){}

    public User(String nameUser, String emailUser){
        this.nameUser = nameUser;
        this.emailUser = emailUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

}
