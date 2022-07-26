package com.example.Stock.Models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Article {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idArt;
    private String designation;
    private double prix;


    public Article() {
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "art_com",
        joinColumns = @JoinColumn(name="idcli"),
        inverseJoinColumns = @JoinColumn(name="idcom")
    )
    private Set<Commande> commandes=new HashSet<>();
    

    public Article(String designation, double prix) {
        this.designation = designation;
        this.prix = prix;
    }

    public Integer getIdArt() {
        return idArt;
    }

    public void setIdArt(Integer idArt) {
        this.idArt = idArt;
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

    @Override
    public String toString() {
        return "Article [designation=" + designation + ", idArt=" + idArt + ", prix=" + prix + "]";
    }

    public Set<Commande> getCommandes() {
        return commandes;
    }
    
    

    
}

