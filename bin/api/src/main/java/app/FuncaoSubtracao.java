package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/subtracao/{n1}/{n2}")
public class FuncaoSubtracao {

    @GET
    public int calcular (@PathParam ("n1") String n1Str, @PathParam ("n2") String n2Str){
        try{
            int n1 = Integer.parseInt(n1Str);
            int n2 = Integer.parseInt(n2Str);
            
            int result = n1 - n2;
            return result;

        }catch(NumberFormatException nfe){
            throw new BadRequestException("Número inválido");

        }

    }

}
