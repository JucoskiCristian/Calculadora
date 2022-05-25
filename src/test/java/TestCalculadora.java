import calculadora.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TestCalculadora {


    @Test
    public void testGetAdicao() {

        Calculadora calculadora =  new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornofeito = calculadora.getAdicao();
        assertEquals(retornoEsperado, retornofeito, 0);
    }
    @Test
    public void testGetSubtracao() {

        Calculadora calculadora =  new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornofeito = calculadora.getSubtracao();
        assertEquals(retornoEsperado, retornofeito, 0);
    }
    @Test
    public void testGetDivisao() {

        Calculadora calculadora =  new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornofeito = calculadora.getDivisao();
        assertEquals(retornoEsperado, retornofeito, 0);
    }
    @Test
    public void testGetProduto() {

        Calculadora calculadora =  new Calculadora(4.0, 2.0);
        double retornoEsperado = 8.0;
        double retornofeito = calculadora.getProduto();
        assertEquals(retornoEsperado, retornofeito, 0);
    }
}