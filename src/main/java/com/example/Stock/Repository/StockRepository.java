package com.example.Stock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Stock.Models.Stock;

public interface StockRepository extends JpaRepository<Stock,Integer> {
    
}
