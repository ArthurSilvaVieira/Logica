package Bolsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class UF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Unidade_Federativa")
    private Integer idUnidadeFederativa;

    @Column(name = "Nome_UF")
    private String nomeUF;

    public Integer getIdUnidadeFederativa() {
        return idUnidadeFederativa;
    }

    public void setIdUnidadeFederativa(Integer idUnidadeFederativa) {
        this.idUnidadeFederativa = idUnidadeFederativa;
    }

    public String getNomeUF() {
        return nomeUF;
    }

    public void setNomeUF(String nomeUF) {
        this.nomeUF = nomeUF;
    }

    public UF(String nomeUF) {
        this.nomeUF = nomeUF;
    }

    @Override
    public String toString() {
        return "UF{" +
                "idUnidadeFederativa=" + idUnidadeFederativa +
                ", nomeUF='" + nomeUF + '\'' +
                '}';
    }

    // Getters e Setters
}

