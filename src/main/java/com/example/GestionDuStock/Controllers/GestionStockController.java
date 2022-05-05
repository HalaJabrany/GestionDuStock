package com.example.GestionDuStock.Controllers;

import com.example.GestionDuStock.eao.CategorieRepository;
import com.example.GestionDuStock.eao.ProduitRepository;
import com.example.GestionDuStock.eao.UsersRepository;
import com.example.GestionDuStock.entites.*;
import com.example.GestionDuStock.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class GestionStockController {

    @Autowired
    private IproduitService iproduitService;
    @Autowired
    private IcategorieService icategorieService;
    @Autowired
    private IcollaborateurService icollaborateurService;
    @Autowired
    private IcommandeService icommandeService;
    @Autowired
    private IuserService iuserService;


    // Controller User Start

    @PostMapping(path = "/ajouterUser")
    public void AJouterUser(@RequestBody Users user ) {

        iuserService.AjouterUser(user);
    }

    @PutMapping(path = "/modifierUser")
    public void ModifierUser( @RequestBody Users user ) {

        iuserService.ModifierUser(user);

    }

    @DeleteMapping(path = "/deleteUser")
    public void DeleteUser( @RequestBody  Users user ) {

        iuserService.SupprimerUser(user);

    }

    @GetMapping(path = "/fetchUsers")
    public List<Users> fetchUsers() {

        return iuserService.listUser();

    }

    // Controller User End




    // Category Controller Start

    @PostMapping(path = "/AjouterCategorie")
    public void AjouterCategorie(@RequestBody Categorie categorie) {

        icategorieService.AjouterCategorie(categorie);

    }

    @PutMapping(path = "/ModifierCategorie")
    public void ModifierCategorie(@RequestBody Categorie categorie) {

        icategorieService.ModifierCategorie(categorie);

    }

    @DeleteMapping(path = "/SupprimerCategorie")
    public void SupprimerCategorie(@RequestBody Categorie categorie) {

        icategorieService.SupprimerCategorie(categorie);

    }

    @GetMapping(value = "/fetchCategorie")
    public List<Categorie> fetchCategorie() {

        return icategorieService.listCategorie();

    }

    // Category Controller End

    // Produit Controller Start

    @PostMapping(path = "/AjouterProduit")
    public void AjouterProduits(@RequestBody Produit produit){

        iproduitService.AjouterProduit(produit);

    }

    @PutMapping(path = "/ModifierProduit")
    public void ModifierProduit(@RequestBody Produit produit) {

        iproduitService.ModifierProduit(produit);

    }

    @DeleteMapping(path = "/SupprimerProduit")
    public void SupprimerProduit(@RequestBody Produit produit) {

        iproduitService.SupprimerProduit(produit);

    }

    @GetMapping(value = "/fetchProduits")
    public List<Produit> fetchProduits() {

        return iproduitService.listProduit();

    }
    // Produit Controller End

    // Collaborateur Controller Start

        @PostMapping(path = "/AjouterCollaborateur")
        public void AjouterCollaborateur( @RequestBody Collaborateur collaborateur) {

            icollaborateurService.AjouterCollaborateur(collaborateur);

        }

        @PutMapping(path = "/ModifierCollaborateur")
        public void ModifierCollaborateur( @RequestBody Collaborateur collaborateur) {

            icollaborateurService.ModifierCollaborateur(collaborateur);

        }


        @DeleteMapping(path = "/SupprimerCollaborateur")
        public void SupprimerCollaborateur( @RequestBody Collaborateur collaborateur) {

            icollaborateurService.SupprimerCollaborateur(collaborateur);

        }

        @GetMapping(value = "/fetchCollaborateur")
        public List<Collaborateur> fetchCollaborateur() {

            return icollaborateurService.listCollaborateur();

        }


    // Collaborateur Controller End


    // Commande Controller Start

    @PostMapping(path = "/AjouterCommande")
    public void AjouterCommande( @RequestBody Commande commande) {

        icommandeService.AjouterCommande(commande);

    }

    @PutMapping(path = "/ModifierCommande")
    public void ModifierCommande(@RequestBody Commande commande) {

        icommandeService.ModifierCommande(commande);

    }

    @DeleteMapping(path = "/SupprimerCommande")
    public void SupprimerCommande(@RequestBody Commande commande) {

        icommandeService.SupprimerCommande(commande);

    }

    @GetMapping(value = "/fetchCommande")
    public List<Commande> fetchCommande() {

        return icommandeService.listCommande();

    }


    // Commande Controller End


}

