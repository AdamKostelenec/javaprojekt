// src/main/java/cz/kostelenec/projekt/entity/Ridic.java
package cz.kostelenec.projekt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Ridic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;
    private LocalDate zamestnanOd;
    private Long tahacId;  // ID tahače, ke kterému je řidič přiřazen

    // Gettery a settery

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }
    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public LocalDate getZamestnanOd() {
        return zamestnanOd;
    }
    public void setZamestnanOd(LocalDate zamestnanOd) {
        this.zamestnanOd = zamestnanOd;
    }

    public Long getTahacId() {
        return tahacId;
    }
    public void setTahacId(Long tahacId) {
        this.tahacId = tahacId;
    }
}
