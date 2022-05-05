package com.example.GestionDuStock.eao;

import com.example.GestionDuStock.entites.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
