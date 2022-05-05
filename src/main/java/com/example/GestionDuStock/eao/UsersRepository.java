package com.example.GestionDuStock.eao;

import com.example.GestionDuStock.entites.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UsersRepository extends JpaRepository<Users, Long> {
}
