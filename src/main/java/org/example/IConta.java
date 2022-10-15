package org.example;

import java.math.BigDecimal;

public interface IConta {
     void sacar(BigDecimal valor);

     void depositar(BigDecimal valor);

     void transferir(BigDecimal valor, Conta contaDestino);

     void imprimirExtrato();

}
