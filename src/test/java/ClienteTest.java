import org.example.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ClienteTest {


    @Test
    void validarIdade(){
        Cliente pessoa = new Cliente("Reury","av.ministro marcos", "88777159", LocalDate.parse("1990-05-31"));
        Assertions.assertEquals(32,pessoa.getIdade());
    }

    @Test
    void cenarioExcecaoMenorDeIdade(){
        Cliente pessoa = new Cliente("Reury","av.ministro marcos", "88777159");

        Assertions.assertThrows(Exception.class, ()->pessoa.setIdade(LocalDate.parse("2018-08-21")));

    }
}
