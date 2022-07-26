package com.example.Stock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Stock.Models.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Integer>{
    
}
