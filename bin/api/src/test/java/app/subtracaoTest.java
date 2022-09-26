package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

public class subtracaoTest {

    @Test
        public void makeSubTest(){

            FuncaoSubtracao sub = new FuncaoSubtracao();
            double resultado = sub.calcular("33", "30");
            assertEquals (3.0, resultado);
        }

        @Test
        public void makeSubTest2(){

            FuncaoSubtracao sub = new FuncaoSubtracao();
            double resultado = sub.calcular("-1", "1");
            assertEquals (-2.0, resultado);
        }

        @Test
        public void makeSubTest3(){

            FuncaoSubtracao sub = new FuncaoSubtracao();
            double resultado = sub.calcular("8.4", "6.2");
            assertEquals (2.2, resultado);
        }
}