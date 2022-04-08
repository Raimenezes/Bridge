import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalconistaTest {

    @Test
    public void deveRetornarSalarioBalconistaComVendedorJunior() {
        Titulo titulo = new VendedorJunior();
        Balconista balconista = new Balconista(2000.0f);
        balconista.setTitulo(titulo);
        assertEquals(2200.0f, balconista.calcularSalario(), 0.01f);
    }

    @Test
    public void deveRetornarSalarioBalconistaComVendedorPleno() {
        Titulo titulo = new VendedorPleno();
        Balconista balconista = new Balconista(2000.0f);
        balconista.setTitulo(titulo);
        assertEquals(2400.0f, balconista.calcularSalario(), 0.01f);
    }

    @Test
    public void deveRetornarSalarioBalconistaComVendedorSenior() {
        Titulo titulo = new VendedorSenior();
        Balconista balconista = new Balconista(2000.0f);
        balconista.setTitulo(titulo);
        assertEquals(2600.0f, balconista.calcularSalario(), 0.01f);
    }
}
