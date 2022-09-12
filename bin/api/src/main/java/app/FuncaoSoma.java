package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/soma/{num1}/{num2}")
public class FuncaoSoma {
    
    @GET
    public double calcular (@PathParam ("num1") String num1Str, @PathParam ("num2") String num2Str){
        try{
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
 
            double num3 = num1 + num2;
        
        // Retornar resultado da soma
            return num3;

        }catch(NumberFormatException nfe){
            throw new BadRequestException("Número inválido");

        }

    }
    
}
