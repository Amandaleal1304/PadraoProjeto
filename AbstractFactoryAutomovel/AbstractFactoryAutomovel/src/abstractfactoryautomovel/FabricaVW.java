
package abstractfactoryautomovel;

public class FabricaVW implements Fabrica{
   @Override
   public Automovel criarAutomovel(){
   return new Gol_VW();
   }
}
