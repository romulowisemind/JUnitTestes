import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {


    @Test
        @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    public void validarAlgoSomenteNoUsuarioRomulo() {
        Assert.assertEquals(10, 5 + 5);
    }
}
