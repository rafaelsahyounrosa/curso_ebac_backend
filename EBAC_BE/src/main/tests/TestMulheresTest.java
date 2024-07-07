import model.Pessoa;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestMulheresTest {

    @Test
    public void testMulheresArray() {

        Pessoa p1 = new Pessoa("Leonardo", "Homem");
        Pessoa p2 = new Pessoa("Marina", "mulher");
        Pessoa p3 = new Pessoa("Rafael", "homem");
        Pessoa p4 = new Pessoa("Yasminn", "MULHER");

        List<Pessoa> pessoas = List.of(p1, p2, p3, p4);

        List<Pessoa> mulheres = Main.filtraMulheres(pessoas);

        boolean passed = mulheres.stream()
                .allMatch(m -> m.getSexo().equalsIgnoreCase("mulher"));

        assertTrue(passed);
    }
}