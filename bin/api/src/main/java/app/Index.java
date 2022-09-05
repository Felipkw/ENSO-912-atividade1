package app;

import io.jooby.annotations.*;


@Path("/")
public class Index {
  
  // Apresentação: 
  @GET
  public String sayHi() {
    return "Bem-vindo a API calculadora CEEF";
  }



}
