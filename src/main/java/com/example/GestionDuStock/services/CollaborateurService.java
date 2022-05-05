package com.example.GestionDuStock.services;

import com.example.GestionDuStock.eao.CollaborateurRepository;
import com.example.GestionDuStock.entites.Collaborateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CollaborateurService implements IcollaborateurService {
@Autowired
    CollaborateurRepository collaborateurRepository;
    @Override
    public void AjouterCollaborateur( Collaborateur collaborateur) {
        collaborateurRepository.save( collaborateur);
    }

    @Override
    public void ModifierCollaborateur( Collaborateur collaborateur) {
         Collaborateur c1=new Collaborateur();
         c1.setIdCollaborateur(collaborateur.getIdCollaborateur());
         c1.setNomCollaborateur(collaborateur.getNomCollaborateur());
         c1.setPrenomCollaborateur(collaborateur.getPrenomCollaborateur());
         c1.setAdresse(collaborateur.getAdresse());
         c1.setPays(collaborateur.getPays());
         c1.setVille(collaborateur.getVille());
         c1.setTelCollaborateur(collaborateur.getTelCollaborateur());
       collaborateurRepository.save(c1);
    }

    @Override
    public void SupprimerCollaborateur(Collaborateur collaborateur) {

        collaborateurRepository.deleteById(collaborateur.getIdCollaborateur());

    }

    @Override
    public List<Collaborateur> listCollaborateur() {
        return collaborateurRepository.findAll();
    }
}
