package com.example.Stock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Stock.Models.Client;

public interface ClientRepository extends JpaRepository<Client,Integer>{
    
}
