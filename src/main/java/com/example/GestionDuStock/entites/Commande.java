package com.example.GestionDuStock.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity

public class Commande implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    @NotNull @Temporal(TemporalType.DATE)
    private Date dateCommande;
    private int qteCommande;
    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinTable(name = "commande_produit",
            joinColumns = @JoinColumn(name = "commande_id", referencedColumnName = "IdCommande"),
            inverseJoinColumns = @JoinColumn(name = "produit_id", referencedColumnName = "IdProduit"))
    @JsonIgnore
    List<Produit> produits = new ArrayList<>();

    @ManyToOne
    private Collaborateur collaborateur;


 public Commande() {
    }

    public Commande(Date dateCommande, int qteCommande, Collaborateur collaborateur) {
        this.dateCommande = dateCommande;
        this.qteCommande = qteCommande;
        this.collaborateur = collaborateur;
    }

    public Commande(Date dateCommande, int qteCommande) {
        this.dateCommande = dateCommande;
        this.qteCommande = qteCommande;

    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public int getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(int qteCommande) {
        this.qteCommande = qteCommande;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}
