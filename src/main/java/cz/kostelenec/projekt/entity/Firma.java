package cz.kostelenec.projekt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Firma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazev;
    private String adresa;
    private String ico;
    private String bankdetails;// ID tahače, ke kterému je řidič přiřazen

    // Gettery a settery

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNazev() {
        return nazev;
    }
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa){
        this.adresa= adresa;
    }
    public String getIco(){
        return ico;
    }
    public void setIco(String ico){
        this.ico =ico;
    }
    public String getBankdetails(){
        return bankdetails;
    }
    public void setBankdetails(String bankdetails){
        this.bankdetails=bankdetails;
    }
}
