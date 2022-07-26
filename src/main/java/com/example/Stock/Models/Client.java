package com.example.Stock.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idcli;
    private String nom;
    private Integer contact;
    private String adresse;


    @OneToMany(targetEntity = Commande.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cc_fk",referencedColumnName = "idcli")
    private List<Commande> commandes;
    
    public Client() {
    }
    public Client(String nom, Integer contact, String adresse) {
        this.nom = nom;
        this.contact = contact;
        this.adresse = adresse;
    }
    public Integer getIdcli() {
        return idcli;
    }
    public void setIdcli(Integer idcli) {
        this.idcli = idcli;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Integer getContact() {
        return contact;
    }
    public void setContact(Integer contact) {
        this.contact = contact;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    @Override
    public String toString() {
        return "Client [adresse=" + adresse + ", contact=" + contact + ", idcli=" + idcli + ", nom=" + nom + "]";
    }
    public List<Commande> getCommandes() {
        return commandes;
    }
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    

    

    

    
    
}
