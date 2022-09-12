package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;


@Path("/divisao/{div1}/{div2}")
public class FuncaoDivisao {
    
  // Função divisão:
  @GET
  public double divisao(@PathParam("div1") String opStr, @PathParam("div2") String opStr2){
       
    try{
        double op = Double.parseDouble(opStr);
        double op2 = Double.parseDouble(opStr2);
       
        // Resposta caso ocorra uma divisão por zero:
        if (op == 0 || op2 == 0) {   
            throw new BadRequestException("A calculadora não pode realizar a divisão de um número por 0");    
        }

        double div = op/op2;
        return div;    
    } catch (NumberFormatException nfe) {
        throw new BadRequestException("Operador inválido. Verifique se você digitou corretamente");
    }
                     
  }
} 