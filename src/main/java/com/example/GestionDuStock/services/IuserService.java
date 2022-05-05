package com.example.GestionDuStock.services;


import com.example.GestionDuStock.entites.Users;

import java.util.List;

public interface IuserService {

    public void AjouterUser(Users user);
    public void ModifierUser(Users user);
    public void SupprimerUser(Users user);
    public List<Users> listUser();

}
