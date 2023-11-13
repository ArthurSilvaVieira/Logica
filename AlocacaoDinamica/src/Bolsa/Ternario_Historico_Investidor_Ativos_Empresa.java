package Bolsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ternario_Historico_Investidor_Ativos_Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_ternario")
    private Integer idTernario;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_movimentacao")
    private LocalDate dataMovimentacao;

    @ManyToOne
    @JoinColumn(name = "Id_investidor")
    private Investidor investidor;

    @ManyToOne
    @JoinColumn(name = "Id_ativos")
    private Ativos ativos;

    @ManyToOne
    @JoinColumn(name = "Id_empresa")
    private Empresa empresa;

    @Column(name = "Variacao")
    private Double variacao;

    public Integer getIdTernario() {
        return idTernario;
    }

    public void setIdTernario(Integer idTernario) {
        this.idTernario = idTernario;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public Ativos getAtivos() {
        return ativos;
    }

    public void setAtivos(Ativos ativos) {
        this.ativos = ativos;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Double getVariacao() {
        return variacao;
    }

    public void setVariacao(Double variacao) {
        this.variacao = variacao;
    }

    public Ternario_Historico_Investidor_Ativos_Empresa(LocalDate dataMovimentacao, Investidor investidor, Ativos ativos, Empresa empresa, Double variacao) {
        this.dataMovimentacao = dataMovimentacao;
        this.investidor = investidor;
        this.ativos = ativos;
        this.empresa = empresa;
        this.variacao = variacao;
    }
    // Getters e Setters

    @Override
    public String toString() {
        return "Ternario_Historico_Investidor_Ativos_Empresa{" +
                "idTernario=" + idTernario +
                ", dataMovimentacao=" + dataMovimentacao +
                ", investidor=" + investidor +
                ", ativos=" + ativos +
                ", empresa=" + empresa +
                ", variacao=" + variacao +
                '}';
    }
}

