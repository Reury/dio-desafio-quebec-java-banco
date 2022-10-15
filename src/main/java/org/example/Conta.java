package org.example;

import java.math.BigDecimal;

public abstract  class Conta implements   IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private final int agencia;
    private final int numeroConta;
    private BigDecimal saldo;

   protected Cliente cliente;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        saldo = new BigDecimal(0);
        cliente = new Cliente();
    }



    public void getInfo() {
        System.out.printf("Dono: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n",this.getAgencia());
        System.out.printf("Conta: %d%n",this.getNumeroConta());
        System.out.printf("saldo: R$%s%n",this.getSaldo());
    }

    @Override
    public void sacar(BigDecimal valor) {
        saldo = saldo.subtract(valor);

    }

    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);

    }

    @Override
    public void transferir(BigDecimal valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
