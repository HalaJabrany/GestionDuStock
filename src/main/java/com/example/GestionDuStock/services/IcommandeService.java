package com.example.GestionDuStock.services;

import com.example.GestionDuStock.entites.Commande;

import java.util.List;

public interface IcommandeService {
    public void AjouterCommande(Commande commande);
    public void ModifierCommande(Commande commande);
    public void SupprimerCommande(Commande commande);
    public List<Commande> listCommande();

}
