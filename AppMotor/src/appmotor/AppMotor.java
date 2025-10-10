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
        // 1. Apresenta um diálogo para o usuário selecionar a fábrica desejada.
        String[] opcoesFabrica = {"Metalúrgico Alemão (Cria Motores de Alumínio)", "Metalúrgico Brasileiro (Cria Motores de Aço)"};
        
        String escolhaFabrica = (String) JOptionPane.showInputDialog(
                null, // Componente pai (null para centralizar na tela)
                "Selecione o tipo de metalúrgico que irá produzir o motor:", // Mensagem
                "Seleção de Fábrica de Motores", // Título da janela
                JOptionPane.QUESTION_MESSAGE, // Tipo de ícone
                null, // Ícone customizado (nenhum)
                opcoesFabrica, // Array de opções
                opcoesFabrica[0]); // Opção padrão

        // Se o usuário fechar a janela ou clicar em "Cancelar", o programa encerra.
        if (escolhaFabrica == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 2. Solicita a especificação do motor (número de cilindros).
        String cilindrosStr = JOptionPane.showInputDialog(
                null,
                "Digite o número de cilindros desejado:",
                "Especificação do Motor",
                JOptionPane.QUESTION_MESSAGE);
        
        // Se o usuário cancelar, encerra o programa.
        if (cilindrosStr == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        Metalurgico metalurgico; // Declara a variável do tipo da interface (abstração)

        // 3. Decide qual fábrica concreta instanciar com base na escolha do usuário.
        // O cliente conhece as fábricas, mas não os produtos que elas criam.
        if (escolhaFabrica.equals(opcoesFabrica[0])) { // Alemão
            metalurgico = new MetAlemao();
        } else { // Brasileiro
            metalurgico = new MetBrasileiro();
        }

        try {
            // Converte a entrada do usuário (String) para um número inteiro.
            int numCilindros = Integer.parseInt(cilindrosStr);
            
            // 4. Utiliza o Factory Method para criar o objeto Motor.
            // O cliente não sabe qual tipo de motor será retornado (Aco ou Aluminio),
            // ele apenas sabe que receberá um objeto que implementa a interface Motor.
            Motor motor = metalurgico.criarMotor(numCilindros);
            
            // 5. Usa o produto criado. O método exibirInfo() é polimórfico.
            motor.exibirInfo();
            
        } catch (NumberFormatException e) {
            // Trata o erro caso o usuário digite algo que não seja um número.
            JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, digite um número para os cilindros.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        
        } catch (IllegalArgumentException e) {
            // Trata a exceção lançada pelas fábricas caso o número de cilindros seja inválido.
            // Ex: Pedir 3 cilindros para o Metalúrgico Brasileiro.
            JOptionPane.showMessageDialog(null, "Erro de Produção: " + e.getMessage(), "Regra de Negócio Violada", JOptionPane.ERROR_MESSAGE);
        }
    }
    }
    

