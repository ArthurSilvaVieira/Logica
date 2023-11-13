package Bolsa;

import java.util.ArrayList;
import java.util.List;

public class CompraVenda {
    private static DynamicList<Ativos> Avenda = new DynamicList<>();
    private static DynamicList<Carteira> Carteiras = new DynamicList<>();
    public void MostraAtivos(){
        for(int i = 0; i<Avenda.size(); i++){
            System.out.println("___________");
            System.out.println("|\t" + Avenda.get(i).getTicker()+"\t|\t"+Avenda.get(i).getCotacao()+"\t|");
        }
        System.out.println("____________");
    }
    public void Vender(Ativos ativo, Carteira carteira){
        Avenda.add(ativo);
        Carteiras.add(carteira);
    }
    public void Comprar(int i, Carteira carteira, Corretora corretora){
        if (carteira.getValorInvestido()> Avenda.get(i).getCotacao())
        carteira.setValorInvestido(carteira.getValorInvestido()-Avenda.get(i).getCotacao());
        else
            System.out.println("Saldo Insuficiente!");
        Carteiras.get(i).setRetornoInvest(Carteiras.get(i).getRetornoInvest()+Avenda.get(i).getCotacao());
        Carteiras.remove(i);
        carteira.getAtivos().add(Avenda.get(i));
        Avenda.get(i).setCompras(Avenda.get(i).getCompras()+1);
        Avenda.remove(i);
        corretora.setOrdem(corretora.getOrdem() + 1);


    }
}
