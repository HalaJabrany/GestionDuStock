package com.example.GestionDuStock.eao;

import com.example.GestionDuStock.entites.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
