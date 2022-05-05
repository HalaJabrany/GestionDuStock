package com.example.GestionDuStock.services;

import com.example.GestionDuStock.eao.CategorieRepository;
import com.example.GestionDuStock.eao.ProduitRepository;
import com.example.GestionDuStock.entites.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional
public class ProduitServiceImp implements IproduitService {

    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    CategorieRepository categorieRepository;


    @Override
    public void AjouterProduit(Produit produit) {

        produitRepository.save(produit);

    }

    @Override
    public void ModifierProduit(Produit produit) {

        Produit p = new Produit();
        p.setIdProduit(produit.getIdProduit());
        p.setNomProduit(produit.getNomProduit());
        p.setQteProduit(produit.getQteProduit());
        p.setPrixProduit(produit.getPrixProduit());
        produitRepository.save(produit);
    }

    @Override
    public void SupprimerProduit(Produit produit) {

        produitRepository.deleteById(produit.getIdProduit());

    }

    @Override
    public List<Produit> listProduit() {
        List<Produit> listProd = produitRepository.findAll(); //

        return listProd;
    }
}
