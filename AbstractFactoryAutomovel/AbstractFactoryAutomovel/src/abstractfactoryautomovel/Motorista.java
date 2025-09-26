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
        
    }
    
}
