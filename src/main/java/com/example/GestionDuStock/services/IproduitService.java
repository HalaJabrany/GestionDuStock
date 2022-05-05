package com.example.GestionDuStock.services;

import com.example.GestionDuStock.entites.Produit;

import java.util.List;


public interface IproduitService {

    public void AjouterProduit(Produit produit);
    public void ModifierProduit(Produit produit);
    public void SupprimerProduit(Produit produit);
    public List<Produit> listProduit();

}
