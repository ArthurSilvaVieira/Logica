package Bolsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Sediada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSediada;

    @ManyToOne
    @JoinColumn(name = "Id_corretora")
    private Corretora corretora;

    @ManyToOne
    @JoinColumn(name = "Id_Endereco")
    private Endereco endereco;


    // Getters e Setters

    public Integer getIdSediada() {
        return idSediada;
    }

    public void setIdSediada(Integer idSediada) {
        this.idSediada = idSediada;
    }

    public Corretora getCorretora() {
        return corretora;
    }

    public void setCorretora(Corretora corretora) {
        this.corretora = corretora;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Sediada(Corretora corretora, Endereco endereco) {
        this.corretora = corretora;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Sediada{" +
                "idSediada=" + idSediada +
                ", corretora=" + corretora +
                ", endereco=" + endereco +
                '}';
    }
}

