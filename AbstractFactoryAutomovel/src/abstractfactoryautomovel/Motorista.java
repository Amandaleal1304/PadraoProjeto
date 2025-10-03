/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryautomovel;

/**
 *
 * @author 0070156
 */
public class Motorista {
    public static void main(String[] args) {
     Fabrica fabrica = new FabricaVW();
     Automovel automovel = fabrica.criarAutomovel();
     automovel.exibirInfo();
     automovel.entrar();
     automovel.ligarMotor();
     automovel.furarPneu();
     
     System.out.println("\n"+"--------------------------------------------------------------------"+"\n");
        
     Fabrica fabrica1 = new FabricaFord();
     Automovel automovel1 = fabrica1.criarAutomovel();
     automovel1.exibirInfo();
     automovel1.entrar();
     automovel1.ligarMotor();
     automovel1.furarPneu();
     
     System.out.println("\n"+"--------------------------------------------------------------------"+"\n");
     
     Fabrica fabrica2 = new FabricaFiat();
     Automovel automovel2 = fabrica2.criarAutomovel();
     automovel2.exibirInfo();
     automovel2.entrar();
     automovel2.ligarMotor();
     automovel2.furarPneu();
     
     System.out.println("\n"+"--------------------------------------------------------------------"+"\n");
     
     Fabrica fabrica3 = new FabricaChevrolet();
     Automovel automovel3 = fabrica3.criarAutomovel();
     automovel3.exibirInfo();
     automovel3.entrar();
     automovel3.ligarMotor();
     automovel3.furarPneu();
     
     
        
    }
    
}
