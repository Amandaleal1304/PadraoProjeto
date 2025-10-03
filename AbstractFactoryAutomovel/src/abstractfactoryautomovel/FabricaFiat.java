
package abstractfactoryautomovel;


public class FabricaFiat implements Fabrica {
   @Override
   public Automovel criarAutomovel(){
   return new Palio_F();
   }
}
