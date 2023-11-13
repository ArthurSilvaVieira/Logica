package Bolsa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TesteConexaoHibernate {

    public static void main(String[] args) {
        try {
            // Carrega a configuração do Hibernate a partir do arquivo hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            // Cria uma fábrica de sessões do Hibernate
            SessionFactory sessionFactory = configuration.buildSessionFactory();

            // Tenta criar uma sessão e, consequentemente, uma conexão com o banco de dados
            sessionFactory.openSession();

            System.out.println("Conexão bem-sucedida!");
        } catch (Exception e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}

