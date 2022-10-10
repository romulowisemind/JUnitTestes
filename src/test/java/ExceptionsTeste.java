import org.example.Conta;
import org.example.TranferenciaEntreContas;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionsTeste {

    @Test
    public void validaCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456789", 100);

        TranferenciaEntreContas tranferenciaEntreContas = new TranferenciaEntreContas();

//        Assert.assertThrows(IllegalAccessError.class, () ->
//                tranferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
//    Assert.assertDoesNotThrow(() -> tranferenciaEntreContas.transfere(contaOrigem,contaDestino,20));
    }

}
