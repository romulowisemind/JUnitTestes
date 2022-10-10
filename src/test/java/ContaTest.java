import org.example.Conta;
import org.junit.Assert;
import org.junit.Test;


/**
 * Classe apresentando mais detalhes das asserções
 */
public class ContaTest {

    @Test
    public void validaSaldo() {
        Conta conta = new Conta("123456", 100);
        Assert.assertNotNull(conta);

        conta.lancaCredito(50);

        Assert.assertEquals(150, conta.getSaldo());

        conta.lancaDebito(50);

        Assert.assertEquals(100, conta.getSaldo());

        Assert.assertNotEquals(101, conta.getSaldo());

        conta = null;
        Assert.assertNull(conta);
    }

}