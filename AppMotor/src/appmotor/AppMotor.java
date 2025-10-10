/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmotor;

import javax.swing.JOptionPane;

/**
 *
 * @author 0070156
 */
public class AppMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  String[] opcoesFabrica = {
            "Metalúrgico Alemão (Cria Motores de Alumínio)", 
            "Metalúrgico Brasileiro (Cria Motores de Aço)",
            "Metalúrgico Japonês (Cria Motores Elétricos)"
        };
        
        String escolhaFabrica = (String) JOptionPane.showInputDialog(
                null,
                "Selecione o tipo de metalúrgico que irá produzir o motor:",
                "Seleção de Fábrica de Motores",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoesFabrica,
                opcoesFabrica[0]);

        if (escolhaFabrica == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String especificacaoStr;
        String promptMensagem;
        String promptTitulo;

        if (escolhaFabrica.equals(opcoesFabrica[2])) {
            promptMensagem = "Digite a potência (kW) desejada para o motor elétrico:";
            promptTitulo = "Especificação do Motor Elétrico";
        } else {
            promptMensagem = "Digite o número de cilindros desejado:";
            promptTitulo = "Especificação do Motor a Combustão";
        }
        
        especificacaoStr = JOptionPane.showInputDialog(
                null,
                promptMensagem,
                promptTitulo,
                JOptionPane.QUESTION_MESSAGE);
        
        if (especificacaoStr == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        Metalurgico metalurgico;

        if (escolhaFabrica.equals(opcoesFabrica[0])) {
            metalurgico = new MetAlemao();
        } else if (escolhaFabrica.equals(opcoesFabrica[1])) {
            metalurgico = new MetBrasileiro();
        } else {
            metalurgico = new MetJapones();
        }

        try {
            int especificacao = Integer.parseInt(especificacaoStr);
            
            Motor motor = metalurgico.criarMotor(especificacao);
            
            motor.exibirInfo();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, digite um valor numérico.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro de Produção: " + e.getMessage(), "Regra de Negócio Violada", JOptionPane.ERROR_MESSAGE);
        }
    }
    }
    

