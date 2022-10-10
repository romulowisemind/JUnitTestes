import org.example.BancoDeDados;
import org.example.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    public static void configuraConexao() {
        BancoDeDados.iniciarConexao();;
    }

    @BeforeEach
    public void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 10, 10, 13, 0, 0)));
    }

    @AfterEach
    public void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 10, 10, 13, 0, 0)));
    }

    @Test
    public void validarDadosDoRetorno() {
        Assert.assertTrue(true);
    }

    @Test
    public void validarDadosDoRetorno2() {
        Assert.assertNull(null);
    }

    @AfterAll
    public static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
    }
}
