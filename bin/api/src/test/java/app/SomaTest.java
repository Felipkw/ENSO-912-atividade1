package app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomaTest {
    
    @Test
    public void verificaSoma(){
        FuncaoSoma soma = new FuncaoSoma();
        double resultado = soma.calcular("4", "2");
        assertEquals(6.0, resultado);
    }

    @Test
    public void verificaSoma2(){
        FuncaoSoma soma = new FuncaoSoma();
        double resultado = soma.calcular("5.1", "5.4");
        assertEquals(10.5, resultado);
    }
    @Test
    public void verificaSoma3(){
        FuncaoSoma soma = new FuncaoSoma();
        double resultado = soma.calcular("12", "-7");
        assertEquals(5.0, resultado);
    }
}

