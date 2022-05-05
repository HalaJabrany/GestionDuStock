package com.example.GestionDuStock.entites;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data

public class Users implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_User;
    @NotNull
    private String login;
    @NotNull
    private String password;

 /*   public Users( String login,  String password) {

        this.login = login;
        this.password = password;
    }
    public Users( Long id, String login,  String password) {
        this.id_User=id;
        this.login = login;
        this.password = password;
    }*/

    public Users() {
    }

    public Users(@NotNull String login, @NotNull String password) {
        this.login = login;
        this.password = password;
    }

    public Long getId_User() {
        return id_User;
    }

    public void setId_User(Long id_User) {
        this.id_User = id_User;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
