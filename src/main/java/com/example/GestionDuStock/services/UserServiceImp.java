package com.example.GestionDuStock.services;

import com.example.GestionDuStock.eao.UsersRepository;
import com.example.GestionDuStock.entites.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements IuserService {


    @Autowired
    UsersRepository usersRepository;


    @Override
    public void AjouterUser( Users user) {
        usersRepository.save(user);

    }

    @Override
    public void ModifierUser(Users user) {
        Users u1=new Users();
        u1.setId_User(user.getId_User());
        u1.setLogin(user.getLogin());
        u1.setPassword(user.getPassword());

        usersRepository.save(user);
    }//3awd db f debug mnin kndiru nuqat lghozyin mnhtajush naawdu nruniw pronjet

    @Override
    public void SupprimerUser(Users user) {

        usersRepository.deleteById(user.getId_User());

    }

    @Override
    public List<Users> listUser() {

        return usersRepository.findAll();

    }

}
