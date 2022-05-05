package com.example.GestionDuStock.services;

import com.example.GestionDuStock.eao.CollaborateurRepository;
import com.example.GestionDuStock.eao.CommandeRepository;
import com.example.GestionDuStock.entites.Commande;
import com.example.GestionDuStock.entites.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommandeServiceImp implements IcommandeService {
@Autowired
   private CommandeRepository commandeRepository;
@Autowired
    private IproduitService iproduitService;
@Autowired
    private IcommandeService icommandeService;

@Autowired
private CollaborateurRepository collaborateurRepository;

    @Override
    public void AjouterCommande(Commande commande) {
        commandeRepository.save(commande);
        Produit p1;
       p1 = commande.getProduits().get(0);
       p1.setQteProduit(p1.getQteProduit() - commande.getQteCommande());
       iproduitService.ModifierProduit(p1);
    }

    //Erreur
    @Override
    public void ModifierCommande(Commande commande) {
        Commande c1=new Commande();
        c1.setIdCommande(commande.getIdCommande());
        c1.setDateCommande(commande.getDateCommande());
        c1.setQteCommande(commande.getQteCommande());
        icommandeService.AjouterCommande(c1);
    }

    //Erreur
    @Override
    public void SupprimerCommande(Commande commande) {

        commandeRepository.deleteById(commande.getIdCommande());

    }

    @Override
    public List<Commande> listCommande() {
        List<Commande> listCommande = commandeRepository.findAll(); //

        return listCommande;
    }

}
