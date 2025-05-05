package cz.kostelenec.projekt.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Cesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cestaId;
    private Long tahacId;
    private Long ridicId;
    private LocalDateTime start;
    private LocalDateTime konec;
    private Integer vzdalenostKm;

    public Long getCestaId() {
        return cestaId;
    }
    public void setCestaId(Long cestaId) {
        this.cestaId = cestaId;
    }

    public Long getTahacId() {
        return tahacId;
    }
    public void setTahacId(Long tahacId) {
        this.tahacId = tahacId;
    }

    public Long getRidicId() {
        return ridicId;
    }
    public void setRidicId(Long ridicId) {
        this.ridicId = ridicId;
    }

    public LocalDateTime getStart() {
        return start;
    }
    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getKonec() {
        return konec;
    }
    public void setKonec(LocalDateTime konec) {
        this.konec = konec;
    }

    public Integer getVzdalenostKm() {
        return vzdalenostKm;
    }
    public void setVzdalenostKm(Integer vzdalenostKm) {
        this.vzdalenostKm = vzdalenostKm;
    }
}