package Bolsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Mora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMora;

    @ManyToOne
    @JoinColumn(name = "Id_investidor")
    private Investidor investidor;

    @ManyToOne
    @JoinColumn(name = "Id_Endereco")
    private Endereco endereco;

    public Integer getIdMora() {
        return idMora;
    }

    public void setIdMora(Integer idMora) {
        this.idMora = idMora;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Mora(Investidor investidor, Endereco endereco) {
        this.investidor = investidor;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Mora{" +
                "idMora=" + idMora +
                ", investidor=" + investidor +
                ", endereco=" + endereco +
                '}';
    }

    // Getters e Setters
}

