
package abstractfactoryautomovel;

public class Celta_C implements Automovel {
    String motor = "VHC";
 String pneu = "Goodyear";

 
 public void Celta_C(){}
 
 @Override
 public void exibirInfo(){
      System.out.println("Modelo: Celta"+"\n"+"Marca: Chevrolet");
     System.out.println("O motor é : "+motor+"\n"+"O pneu é: "+pneu);
 }

    @Override
    public void entrar() {
        System.out.println("Entrando no Celta.");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor VHC ligado!");
    }

    @Override
    public void furarPneu() {
        System.out.println("TCHEEE! O pneu furou.");
    }
}
