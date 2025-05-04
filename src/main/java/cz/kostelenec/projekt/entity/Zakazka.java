package cz.kostelenec.projekt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Zakazka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cena;
    private Long ridicId;
    private Long tahacId;
    private String status;

    private LocalDate vytvoreno;

    // Gettery a settery

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getCena() { return cena; }
    public void setCena(Long cena) { this.cena = cena; }

    public Long getRidicId() { return ridicId; }
    public void setRidicId(Long ridicId) { this.ridicId = ridicId; }

    public Long getTahacId() { return tahacId; }
    public void setTahacId(Long tahacId) { this.tahacId = tahacId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getVytvoreno() { return vytvoreno; }
    public void setVytvoreno(LocalDate vytvoreno) { this.vytvoreno = vytvoreno; }
}