package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    mvc(new Index());
    
    mvc(new FuncaoSubtracao());

    mvc(new FuncaoSoma());

    mvc(new FuncaoDivisao());

    mvc (new FuncaoMultiplicacao());

  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
