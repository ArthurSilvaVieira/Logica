package Bolsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Municipio")
    private Integer idMunicipio;

    @ManyToOne
    @JoinColumn(name = "Id_UF")
    private UF uf;

    @Column(name = "Nome_Muni")
    private String nomeMunicipio;

    // Getters e Setters

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public Municipio(UF uf, String nomeMunicipio) {
        this.uf = uf;
        this.nomeMunicipio = nomeMunicipio;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "idMunicipio=" + idMunicipio +
                ", uf=" + uf +
                ", nomeMunicipio='" + nomeMunicipio + '\'' +
                '}';
    }
}

