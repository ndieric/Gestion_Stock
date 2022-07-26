package com.example.Stock.Models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer iduti;
    private String nomUtilisateur;
    private String password;


    @ManyToMany
    @JoinTable(name = "uti_role",
        joinColumns = @JoinColumn(name="iduti"),
        inverseJoinColumns = @JoinColumn(name="idRol")
    )
    private Set<Role> roles=new HashSet<>();
    public Utilisateur() {
    }
    public Utilisateur(String nomUtilisateur, String password) {
        this.nomUtilisateur = nomUtilisateur;
        this.password = password;
    }
    public Integer getIduti() {
        return iduti;
    }
    public void setIduti(Integer iduti) {
        this.iduti = iduti;
    }
    public String getNomUtilisateur() {
        return nomUtilisateur;
    }
    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Utilisateur [iduti=" + iduti + ", nomUtilisateur=" + nomUtilisateur + ", password=" + password + "]";
    }
    
    
    


    
    
}
