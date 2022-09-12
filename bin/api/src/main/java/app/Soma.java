package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/soma/{num1}/{num2}")
public class Soma {
    
    @GET
    public int calcular (@PathParam ("num1") String num1Str, @PathParam ("num2") String num2Str){
        try{
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            return num1 + num2;
        }catch(NumberFormatException nfe){
            throw new BadRequestException("Número inválido");

        }

    }
    
}
