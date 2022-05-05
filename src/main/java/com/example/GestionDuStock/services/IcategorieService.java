package com.example.GestionDuStock.services;

import com.example.GestionDuStock.entites.Categorie;

import java.util.List;

public interface IcategorieService {

    public void AjouterCategorie(Categorie categorie);
    public void ModifierCategorie(Categorie categorie);
    public void SupprimerCategorie(Categorie categorie);
    public List<Categorie> listCategorie();
}
