package app;

import io.jooby.annotations.*;


@Path("/")
public class Index {
  
  // Apresentação: 
  @GET

  public String All(){
    String all = sayHi() + howSoma() + howSubtracao() + howMultiplicacao() + howDivisao();
    return all;
  }



  public String sayHi() {
    return "Bem-vindo a API calculadora CEEF\n\n";
  }

  public String howSoma() {
    return "\n \t - Para usar a funcionalidade da soma digite a frente da URL: /soma/(primeiro numero a ser somado)/(segundo numero a ser somado)";
  }

  public String howSubtracao() {
    return "\n\n \t - Para usar a funcionalidade da subtracao digite a frente da URL: /subtracao/(numero que sera subtraido)/(numero que vai subtrair)";
  }

  public String howMultiplicacao() {
    return "\n\n \t - Para usar a funcionalidade da multiplicacao digite a frente da URL: /multiplicacao/(numero que sera multiplicado)/(numero que vai multiplicar)";
  }

  public String howDivisao() {
    return "\n\n \t - Para usar a funcionalidade da divisao digite a frente da URL: /divisao/(numero que sera dividido)/(numero que vai dividir)";
  }

}
