package abstractfactoryautomovel;

public class FabricaFord implements Fabrica{
   @Override
   public Automovel criarAutomovel(){
   return new KA_Ford();
   }
}
