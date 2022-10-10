import org.example.Pessoa;
import org.junit.Test;

import java.time.LocalDateTime;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AssertionsTest {

    @Test
    public void validarL4ancamentos() {
        int[] primeiroLancamento = { 10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    public void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Romuleta", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    public void validarQueValoresSaoDiferentes(){

        int x = 5;
        int y = 6;

        assertNotEquals(5, 6);
    }

    @Test
    public void validarQueAlgumaCondicaoEhFalsa() {

        boolean condicao = 5 + 6 == 12;

        assertFalse(condicao);
    }
}
