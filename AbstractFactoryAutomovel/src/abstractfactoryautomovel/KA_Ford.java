
package abstractfactoryautomovel;

public class KA_Ford implements Automovel{
 String motor = "CHT";
 String pneu = "Firestone";

 
 public void KA_Ford(){}
 
 @Override
 public void exibirInfo(){
    System.out.println("Modelo: KA"+"\n"+"Marca: Ford");
     System.out.println("O motor é : "+motor+"\n"+"O pneu é: "+pneu);
 }

    @Override
    public void entrar() {
        System.out.println("TREM!");
    }

    @Override
    public void ligarMotor() {
        System.out.println("CHT ligado");
    }

    @Override
    public void furarPneu() {
        System.out.println("TCHEEE!");
    }
}
