package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/subtracao/{n1}/{n2}")
public class FuncaoSubtracao {

    @GET
    public double calcular (@PathParam ("n1") String n1Str, @PathParam ("n2") String n2Str){
        try{
            double n1 = Double.parseDouble(n1Str);
            double n2 = Double.parseDouble(n2Str);
        
            // Atribuindo resultado para uma variável 'result'
            double result = n1 - n2;
            
            return result;

        }catch(NumberFormatException nfe){
            throw new BadRequestException("Operador inválido. Verifique se você digitou corretamente");

        }

    }

}
