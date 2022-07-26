package com.example.Stock.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    @GeneratedValue
    private Integer idRol;
    private LesRoles name;
    public Role() {
    }
    public Role(LesRoles name) {
        this.name = name;
    }
    public Integer getIdRol() {
        return idRol;
    }
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }
    public LesRoles getName() {
        return name;
    }
    public void setName(LesRoles name) {
        this.name = name;
    }

    
    
    
    
    
}
