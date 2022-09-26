package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;;

public class DivisaoTest {

    FuncaoDivisao funcaoDivisao;

    @Test
    public void verifyDivisionForZero() {
        funcaoDivisao = new FuncaoDivisao();
        assertThrows(BadRequestException.class, () -> {
            funcaoDivisao.divisao("4", "0");
        });
    }

    @Test
    public void verifyPrecision() {
        funcaoDivisao = new FuncaoDivisao();
        double resultado = funcaoDivisao.divisao("25", "5");
        assertEquals(5.0, resultado);
    }

    @Test
    public void verifyNegative(){
        funcaoDivisao = new FuncaoDivisao();
        double resultado = funcaoDivisao.divisao("-30", "5");
        assertEquals(-6.0, resultado);
    }

}
