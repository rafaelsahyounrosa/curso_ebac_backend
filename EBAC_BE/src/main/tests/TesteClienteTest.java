import model.TesteCliente;
import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {

        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rafael");
        cli.adicionarNome1("Rafael");

        Assert.assertEquals("Rafael", cli.getNome());
    }
}
