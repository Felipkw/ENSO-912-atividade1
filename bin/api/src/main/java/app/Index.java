package app;

import io.jooby.annotations.*;


@Path("/")

public class Index {
  
  // Junção dos elementos 
  @GET
  public String All() {  
    String all = sayHi() + showDivisao();
    return all;
  }

  // Apresentação da calculadora
  public String sayHi() {
    return "Bem-vindo a API calculadora CEEF!";
  }

  // Ensinando a usar a função 'divisao' da calculadora
  public String showDivisao(){
    return "\n\nPara utilizar a funcao 'divisao' digite a frente da URL: divisao/(dividendo)/(divisor)";
  }
}