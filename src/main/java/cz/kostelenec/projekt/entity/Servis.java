package cz.kostelenec.projekt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Servis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long tahacId;
    private String popis;
    private int cena;

    private LocalDate datum;

    // Gettery a settery

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getTahacId() { return tahacId; }
    public void setTahacId(Long tahacId) { this.tahacId = tahacId; }

    public String getPopis() { return popis; }
    public void setPopis(String popis) { this.popis = popis; }

    public int getCena() { return cena; }
    public void setCena(int cena) { this.cena = cena; }

    public LocalDate getDatum() { return datum; }
    public void setDatum(LocalDate datum) { this.datum = datum; }
}