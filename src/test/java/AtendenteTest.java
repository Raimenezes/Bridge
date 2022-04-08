import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtendenteTest {

    @Test
    public void deveRetornarSalarioAtendenteComVendedorJunior(){
        Titulo titulo = new VendedorJunior();
        Atendente atendente = new Atendente(1000.0f);
        atendente.setTitulo(titulo);
        assertEquals(1000.0f, atendente.calcularSalario(), 0.01f);
    }

    @Test
    public void deveRetornarSalarioAtendenteComVendedorPleno(){
        Titulo titulo = new VendedorPleno();
        Atendente atendente = new Atendente(1000.0f);
        atendente.setTitulo(titulo);
        assertEquals(1000.0f, atendente.calcularSalario(), 0.01f);
    }
    @Test

    public void deveRetornarSalarioAtendenteComVendedorSenior(){
        Titulo titulo = new VendedorSenior();
        Atendente atendente = new Atendente(1000.0f);
        atendente.setTitulo(titulo);
        assertEquals(1000.0f, atendente.calcularSalario(), 0.01f);
    }
}
