package app;
 
import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;
 
 
@Path("/multiplicacao/{multi1}/{multi2}")
public class FuncaoMultiplicacao {
 
  // Função multiplicação:
  
  @GET
  public double multiplicacao(@PathParam("multi1") String opStr, @PathParam("multi2") String opStr2){
 
    try{
        double op = Double.parseDouble(opStr);
        double op2 = Double.parseDouble(opStr2);
 
       //Realizando a operação:
        double mult = op * op2;
        return mult;    
    } catch (NumberFormatException nfe) {
        throw new BadRequestException("Operador inválido. Verifique se você digitou corretamente");
    }
 
  }
}
