package com.example.Stock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Stock.Models.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer>{
    
}
