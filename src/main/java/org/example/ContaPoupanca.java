package org.example;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta poupança ===");
        super.getInfo();
    }

    public ContaPoupanca(Cliente cliente) {
        super.cliente = cliente;
    }
}
