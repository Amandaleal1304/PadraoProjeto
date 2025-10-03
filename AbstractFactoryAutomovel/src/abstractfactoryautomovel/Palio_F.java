
package abstractfactoryautomovel;

public class Palio_F implements Automovel{
 String motor = "Fire";
 String pneu = "Pirelli";

 
 public void Palio_F(){}
 
 @Override
 public void exibirInfo(){
      System.out.println("Modelo: Palio"+"\n"+"Marca: Fiat");
     System.out.println("O motor é : "+motor+"\n"+"O pneu é: "+pneu);
 }

    @Override
    public void entrar() {
        System.out.println("Entrando no Palio.");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor Fire ligado!");
    }

    @Override
    public void furarPneu() {
        System.out.println("TCHEEE! O pneu furou.");
    }
}
