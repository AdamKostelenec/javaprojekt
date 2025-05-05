package cz.kostelenec.projekt.entity;

import jakarta.persistence.*;

@Entity
public class Naklad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nakladId;
    private Long zakazkaId;
    private Long cestaId;
    private String popis;
    private Integer cena;

    public Long getNakladId() {
        return nakladId;
    }
    public void setNakladId(Long nakladId) {
        this.nakladId = nakladId;
    }

    public Long getZakazkaId() {
        return zakazkaId;
    }
    public void setZakazkaId(Long zakazkaId) {
        this.zakazkaId = zakazkaId;
    }

    public Long getCestaId() {
        return cestaId;
    }
    public void setCestaId(Long cestaId) {
        this.cestaId = cestaId;
    }

    public String getPopis() {
        return popis;
    }
    public void setPopis(String popis) {
        this.popis = popis;
    }

    public Integer getCena() {
        return cena;
    }
    public void setCena(Integer cena) {
        this.cena = cena;
    }
}