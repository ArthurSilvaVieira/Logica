package Bolsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_carteira")
    private Integer idCarteira;

    @Column(name = "Valor_investido")
    private Double valorInvestido;

    @Column(name = "Retorno_inves")
    private Double retornoInvest;

    @ManyToOne
    @JoinColumn(name = "Id_corretora")
    private Corretora corretora;

    @Column
    private DynamicList<Ativos> ativos = new DynamicList<>();

    @ManyToOne
    @JoinColumn(name = "Id_investidor")
    private Investidor investidor;

    // Getters e Setters

    public Carteira(Double valorInvestido, Double retornoInvest, Corretora corretora, DynamicList<Ativos> ativos, Investidor investidor) {
        this.valorInvestido = valorInvestido;
        this.retornoInvest = retornoInvest;
        this.corretora = corretora;
        this.ativos = ativos;
        this.investidor = investidor;
    }

    public Integer getIdCarteira() {
        return idCarteira;
    }

    public void setIdCarteira(Integer idCarteira) {
        this.idCarteira = idCarteira;
    }

    public Double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(Double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Double getRetornoInvest() {
        return retornoInvest;
    }

    public void setRetornoInvest(Double retornoInvest) {
        this.retornoInvest = retornoInvest;
    }

    public Corretora getCorretora() {
        return corretora;
    }

    public void setCorretora(Corretora corretora) {
        this.corretora = corretora;
    }

    public DynamicList<Ativos> getAtivos() {
        return ativos;
    }

    public void setAtivos(DynamicList<Ativos> ativos) {
        this.ativos = ativos;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    @Override
    public String toString() {
        return "Carteira{" +
                "idCarteira=" + idCarteira +
                ", valorInvestido=" + valorInvestido +
                ", retornoInvest=" + retornoInvest +
                ", corretora=" + corretora +
                ", ativos=" + ativos +
                ", investidor=" + investidor +
                '}';
    }
}

