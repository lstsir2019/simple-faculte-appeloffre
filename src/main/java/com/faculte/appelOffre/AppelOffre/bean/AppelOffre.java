/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faculte.appelOffre.AppelOffre.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author YSN
 */
@Entity
public class AppelOffre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String objectif;
    private BigDecimal montantHT;
    private BigDecimal montantTTC;
    private BigDecimal montantGarantieTemp;

    @OneToMany(mappedBy = "appelOffre")
    private List<AppelOffreDetail> appelOffreDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public BigDecimal getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(BigDecimal montantHT) {
        this.montantHT = montantHT;
    }

    public BigDecimal getMontantTTC() {
        return montantTTC;
    }

    public void setMontantTTC(BigDecimal montantTTC) {
        this.montantTTC = montantTTC;
    }

    public BigDecimal getMontantGarantieTemp() {
        return montantGarantieTemp;
    }

    public void setMontantGarantieTemp(BigDecimal montantGarantieTemp) {
        this.montantGarantieTemp = montantGarantieTemp;
    }

    @JsonIgnore
    public List<AppelOffreDetail> getAppelOffreDetails() {
        return appelOffreDetails;
    }
    @JsonSetter
    public void setAppelOffreDetails(List<AppelOffreDetail> appelOffreDetails) {
        this.appelOffreDetails = appelOffreDetails;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppelOffre)) {
            return false;
        }
        AppelOffre other = (AppelOffre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AppelOffre{" + "id=" + id + ", objectif=" + objectif + ", montantHT=" + montantHT + ", montantTTC=" + montantTTC + ", montantGarantieTemp=" + montantGarantieTemp + ", appelOffreDetails=" + appelOffreDetails + '}';
    }

   
}
