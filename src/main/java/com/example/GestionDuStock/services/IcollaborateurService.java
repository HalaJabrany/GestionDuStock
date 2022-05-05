package com.example.GestionDuStock.services;

import com.example.GestionDuStock.entites.Collaborateur;

import java.util.List;

public interface IcollaborateurService {
    public void AjouterCollaborateur(Collaborateur collaborateur);
    public void ModifierCollaborateur(Collaborateur collaborateur);
    public void SupprimerCollaborateur(Collaborateur collaborateur);
    public List<Collaborateur> listCollaborateur();


}
