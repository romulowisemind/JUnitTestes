import org.junit.Assert;
import org.junit.Test;

public class AssumptionsTest {

    @Test
    public void validarAlgoSomenteNoUsuarioRomulo() {
        Assert.assertTrue("romul".equals(System.getenv("USER")));
        Assert.assertEquals(10, 5 + 5);
    }
}
