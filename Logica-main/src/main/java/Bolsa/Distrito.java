package Bolsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Distrito")
    private Integer idDistrito;

    @ManyToOne
    @JoinColumn(name = "Id_Municio")
    private Municipio municipio;

    @Column(name = "Nome_Distrit")
    private String nomeDistrito;

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public String getNomeDistrito() {
        return nomeDistrito;
    }

    public void setNomeDistrito(String nomeDistrito) {
        this.nomeDistrito = nomeDistrito;
    }

    public Distrito(Municipio municipio, String nomeDistrito) {
        this.municipio = municipio;
        this.nomeDistrito = nomeDistrito;
    }

    @Override
    public String toString() {
        return "Distrito{" +
                "idDistrito=" + idDistrito +
                ", municipio=" + municipio +
                ", nomeDistrito='" + nomeDistrito + '\'' +
                '}';
    }

    // Getters e Setters
}

