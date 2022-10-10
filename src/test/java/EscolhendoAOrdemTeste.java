import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {
    @DisplayName("Teste que valida se o usuario foi criado")
    @Order(4)
    @Test
    public void valixaFluxoA() {
        Assert.assertTrue(true);
    }
    @DisplayName("B")
    @Order(3)
    @Test
    public void valixaFluxoB() {
        Assert.assertTrue(true);
    }
    @DisplayName("C")
    @Order(2)
    @Test
    public void valixaFluxoC() {
        Assert.assertTrue(true);
    }
    @DisplayName("D")
    @Order(1)
    @Test
    public void valixaFluxoD() {
        Assert.assertTrue(true);
    }
}
