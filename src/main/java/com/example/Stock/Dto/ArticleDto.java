package com.example.Stock.Dto;

import java.util.HashSet;
import java.util.Set;

import com.example.Stock.Models.Commande;

public class ArticleDto {
    private String designation;
    private double prix;
    private Set<Commande> commandes=new HashSet<>();
    public ArticleDto() {
    }
    public ArticleDto(String designation, double prix, Set<Commande> commandes) {
        this.designation = designation;
        this.prix = prix;
        this.commandes = commandes;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Set<Commande> getCommandes() {
        return commandes;
    }
    public void setCommandes(Set<Commande> commandes) {
        this.commandes = commandes;
    }
    
    

    


}
