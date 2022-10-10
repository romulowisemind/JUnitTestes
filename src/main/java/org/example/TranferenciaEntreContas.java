package org.example;

public class TranferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) throws IllegalAccessError {
        if (valor <= 0) {
            throw new IllegalAccessError("valor deve ser maior que zero.");

        }
    }
}
