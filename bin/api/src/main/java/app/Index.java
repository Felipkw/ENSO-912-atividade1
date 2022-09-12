package app;

import io.jooby.annotations.*;


@Path("/")
public class Index {
  
  // Junção dos elementos 
  @GET

  public String sayHi() {
    return "Bem-vindo a API calculadora CEEF";
  }

  


}
