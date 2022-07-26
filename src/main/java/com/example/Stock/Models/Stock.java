package com.example.Stock.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Stock {
    @Id
    @GeneratedValue
    private Integer idStock;


    @ManyToOne
    @JoinColumn(name = "idArt")
    private Article article;
    
}
