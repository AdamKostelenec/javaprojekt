package cz.kostelenec.projekt.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Kontrola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kontrolaId;
    private Long tahacId;
    private LocalDateTime datum;
    private Integer typ;
    private String vysledek;
    private LocalDateTime dalsiKontrola;

    public Long getKontrolaId() {
        return kontrolaId;
    }
    public void setKontrolaId(Long kontrolaId) {
        this.kontrolaId = kontrolaId;
    }

    public Long getTahacId() {
        return tahacId;
    }
    public void setTahacId(Long tahacId) {
        this.tahacId = tahacId;
    }

    public LocalDateTime getDatum() {
        return datum;
    }
    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    public Integer getTyp() {
        return typ;
    }
    public void setTyp(Integer typ) {
        this.typ = typ;
    }

    public String getVysledek() {
        return vysledek;
    }
    public void setVysledek(String vysledek) {
        this.vysledek = vysledek;
    }

    public LocalDateTime getDalsiKontrola() {
        return dalsiKontrola;
    }
    public void setDalsiKontrola(LocalDateTime dalsiKontrola) {
        this.dalsiKontrola = dalsiKontrola;
    }
}