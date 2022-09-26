package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class MultiplicacaoTest{

FuncaoMultiplicacao multiplicacao;
@Test
public void Multpor0(){
    multiplicacao = new FuncaoMultiplicacao();
    double resultado=  multiplicacao.multiplicacao("0", "5");
    assertEquals(0.0, resultado);

}
@Test
public void Multiplica1x5(){
    multiplicacao= new FuncaoMultiplicacao();
    double resultado= multiplicacao.multiplicacao("1","5");
    assertEquals(5, resultado);

}
@Test
public void Multiplica1negativo(){
    multiplicacao=new FuncaoMultiplicacao();
    double resultado= multiplicacao.multiplicacao("1","-0.1");
    assertEquals(-0.1, resultado);

}

}






