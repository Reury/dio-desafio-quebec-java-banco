package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cliente test = new Cliente("Reury","av.  ministro", "88345999");
        Cliente test2 = new Cliente("lorran","av.  janga", "872145999");
        Conta cc = new ContaCorrente(test);
        BigDecimal x = new BigDecimal("50.90");
        Conta poupanca = new ContaPoupanca(test2);
        cc.depositar(x);
        poupanca.depositar(x);
        cc.transferir(x,poupanca);
        poupanca.depositar(x);
        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
    }
}
