package org.example;

import java.math.BigDecimal;

public class ContaCorrente extends  Conta {

    public ContaCorrente(Cliente cliente) {
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.getInfo();
    }

}
