package cz.kostelenec.projekt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Tahac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String znacka;
    private String model;
    private String spz;
    private int stavKm;

    private LocalDate stk;
    private LocalDate dalnicniZnamka;
    private LocalDate registraceDatum;

    // Gettery a settery

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getZnacka() { return znacka; }
    public void setZnacka(String znacka) { this.znacka = znacka; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getSpz() { return spz; }
    public void setSpz(String spz) { this.spz = spz; }

    public int getStavKm() { return stavKm; }
    public void setStavKm(int stavKm) { this.stavKm = stavKm; }

    public LocalDate getStk() { return stk; }
    public void setStk(LocalDate stk) { this.stk = stk; }

    public LocalDate getDalnicniZnamka() { return dalnicniZnamka; }
    public void setDalnicniZnamka(LocalDate dalnicniZnamka) { this.dalnicniZnamka = dalnicniZnamka; }

    public LocalDate getRegistraceDatum() { return registraceDatum; }
    public void setRegistraceDatum(LocalDate registraceDatum) { this.registraceDatum = registraceDatum; }
}