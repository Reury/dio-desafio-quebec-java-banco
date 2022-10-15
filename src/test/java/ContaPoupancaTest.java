import org.example.Cliente;
import org.example.Conta;
import org.example.ContaCorrente;
import org.example.ContaPoupanca;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContaPoupancaTest {


    @Test
    void validarSaque(){
        Cliente pessoa = new Cliente("Reury","av.ministro marcos", "88777159", LocalDate.parse("1990-05-31"));
        Conta cc = new ContaPoupanca(pessoa);
        cc.depositar(new BigDecimal("499.90"));
        cc.sacar(new BigDecimal("45"));
        Assertions.assertEquals(new BigDecimal("454.90"),cc.getSaldo());
    }

    @Test
    void validarDeposito(){
        Cliente pessoa = new Cliente("Reury","av.ministro marcos", "88777159", LocalDate.parse("1990-05-31"));
        Conta cc = new ContaPoupanca(pessoa);
        cc.depositar(new BigDecimal("144.30"));
        Assertions.assertEquals(new BigDecimal("144.30"), cc.getSaldo());

    }

    @Test
    void validarTransferencia(){
        Cliente pessoa = new Cliente("Reury","av.ministro marcos", "88777159", LocalDate.parse("1990-05-31"));
        Conta cc = new ContaPoupanca(pessoa);
        cc.depositar(new BigDecimal("300"));
        Cliente pessoa2 = new Cliente("Bruno","av.sampa", "98666969", LocalDate.parse("1994-08-24"));
        Conta cc2 = new ContaPoupanca(pessoa2);
        cc2.depositar(new BigDecimal("100"));
        cc.transferir(new BigDecimal("50"),cc2);
        Assertions.assertEquals(new BigDecimal("250"),cc.getSaldo());
        Assertions.assertEquals(new BigDecimal("150"),cc2.getSaldo());

    }
}
