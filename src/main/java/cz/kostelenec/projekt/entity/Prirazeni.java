package cz.kostelenec.projekt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Prirazeni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ridicId;
    private Long tahacId;
    private LocalDateTime prirazenoOd;
    private LocalDateTime prirazenoDo;

    // Gettery a settery

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getRidicId() {
        return ridicId;
    }
    public void setRidicId(Long ridicId) {
        this.ridicId = ridicId;
    }

    public Long getTahacId() {
        return tahacId;
    }
    public void setTahacId(Long tahacId) {
        this.tahacId = tahacId;
    }

    public LocalDateTime getPrirazenoOd() {
        return prirazenoOd;
    }
    public void setPrirazenoOd(LocalDateTime prirazenoOd) {
        this.prirazenoOd = prirazenoOd;
    }

    public LocalDateTime getPrirazenoDo() {
        return prirazenoDo;
    }
    public void setPrirazenoDo(LocalDateTime prirazenoDo) {
        this.prirazenoDo = prirazenoDo;
    }
}
