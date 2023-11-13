package Bolsa;

import org.apache.tools.ant.DynamicAttribute;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Avaliacao {

    LocalDateTime inicial = LocalDateTime.of(2023, 11, 1, 0, 0);
    LocalDateTime atual = inicial;

    DynamicList<Ativos> Bolsa = new DynamicList<>();

    public void PassarDia() {
        while (atual.getHour() < 18) {

            for (int i = 0; i < Bolsa.size(); i++) {
                Random random = new Random(i + (atual.getDayOfMonth() / i));
                Double k = random.nextDouble(0.00001, 0.1);
                Bolsa.get(i).setCotacao(Bolsa.get(i).getCotacao() * (1 + k));
            }

            atual.plusHours(1);
        }
        atual = atual.plusDays(1).minusHours(8);
    }

    public void PassarMes() {
        for (int i = 0; i < 31; i++) {

            int diaS = atual.getDayOfWeek().getValue();

            if (atual.getDayOfMonth() == 2 && atual.getDayOfMonth() == 15 && atual.getDayOfMonth() == 20) {
                atual.plusDays(1);
            } else if (diaS > 0 && diaS < 6)
                PassarDia();
            else
                atual.plusDays(1);
        }
    }

}