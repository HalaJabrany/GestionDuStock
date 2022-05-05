package com.example.GestionDuStock.eao;

import com.example.GestionDuStock.entites.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface  CollaborateurRepository extends JpaRepository<Collaborateur, Long> {
}
