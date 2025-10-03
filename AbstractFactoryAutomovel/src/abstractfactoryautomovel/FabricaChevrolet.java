
package abstractfactoryautomovel;

public class FabricaChevrolet implements Fabrica {
     @Override
   public Automovel criarAutomovel(){
   return new Celta_C();
   }
}
