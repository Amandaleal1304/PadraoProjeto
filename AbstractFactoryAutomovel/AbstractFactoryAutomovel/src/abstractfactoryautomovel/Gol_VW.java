
package abstractfactoryautomovel;

public class Gol_VW implements Automovel{
 String  motor = "AP";
 String pneu = "Goodyear";

 public void Gol_VW(){}
 
 
 @Override
 public void exibirInfo(){
       System.out.println("O motor é : "+motor+"\n"+"O pneu é: "+pneu);
 }
 
    @Override
    public void entrar() {
        System.out.println("BRUM!");
    }

    @Override
    public void ligarMotor() {
        System.out.println("AP Ligado”");
    }

    @Override
    public void furarPneu() {
        System.out.println("Chash!");
    }
}
