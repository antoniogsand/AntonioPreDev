public class App {
    public static void main(String[] args) throws Exception {
      
      Reloj reloj= new Reloj();
      // incrementa un segundo los segundos
      reloj.incrementar();

      for(int i= 0; i<3605; i++){
        reloj.incrementar();
        
        System.out.println(reloj);
      }
      
      System.out.println("Esto no es el bucle "+reloj);

    




    }
}
