package cz.kostelenec.projekt.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Palivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long palivoId;
    private Long tahacId;
    private LocalDateTime datum;
    private Integer mnozstviLitry;
    private Integer cena;

    public Long getPalivoId() {
        return palivoId;
    }
    public void setPalivoId(Long palivoId) {
        this.palivoId = palivoId;
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

    public Integer getMnozstviLitry() {
        return mnozstviLitry;
    }
    public void setMnozstviLitry(Integer mnozstviLitry) {
        this.mnozstviLitry = mnozstviLitry;
    }

    public Integer getCena() {
        return cena;
    }
    public void setCena(Integer cena) {
        this.cena = cena;
    }
}