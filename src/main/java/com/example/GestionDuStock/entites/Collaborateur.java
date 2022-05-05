package com.example.GestionDuStock.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data
public class Collaborateur implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCollaborateur;
    @NotNull @Column(name = "nomcollaborateur")
    private String nomCollaborateur;
    @NotNull
    private String prenomCollaborateur;
    private String adresse;
    private String pays;
    private String ville;
    private String telCollaborateur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "collaborateur")
    @JsonIgnore
    private Collection<Commande> commandes;




}
