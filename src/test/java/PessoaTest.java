import org.example.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    public void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 10, 10, 15, 0, 0));
        //o que a gente espera do lado esquerdo e o que a gente vai chamar do lado direito
        Assertions.assertEquals(21, jessica.getIdade());
    }

    @Test
    public void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 10, 10, 15, 0, 0));
        Assert.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

}
