package org.example;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        //Fez algo
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no BD
        LOGGER.info("Inseriu Dados.");
    }

    public static void removeDados(Pessoa pessoa) {
        //Remove pessoa no BD
        LOGGER.info("Removeu dados");
    }
}
