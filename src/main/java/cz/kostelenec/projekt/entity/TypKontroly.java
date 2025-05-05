package cz.kostelenec.projekt.entity;

import jakarta.persistence.*;

@Entity
public class TypKontroly {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typ;
    private String popis;

    public Long getTyp() {
        return typ;
    }
    public void setTyp(Long typ) {
        this.typ = typ;
    }

    public String getPopis() {
        return popis;
    }
    public void setPopis(String popis) {
        this.popis = popis;
    }
}