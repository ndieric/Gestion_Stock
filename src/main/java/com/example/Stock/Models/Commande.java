package com.example.Stock.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commande {
    @Id
    @GeneratedValue
    private Integer idCom;
    private String code;
    private Date datecommande; 

    public Commande() {
    }

    public Commande(String code, Date datecommande, Client client) {
        this.code = code;
        this.datecommande = datecommande;
    
    }

    public Integer getIdCom() {
        return idCom;
    }

    public void setIdCom(Integer idCom) {
        this.idCom = idCom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDatecommande() {
        return datecommande;
    }

    public void setDatecommande(Date datecommande) {
        this.datecommande = datecommande;
    }

 
    

    
    
}
