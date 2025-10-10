
package appmotor;

import javax.swing.JOptionPane;

public class MotorEletrico implements Motor{
    
private final int potenciaKW;
    private final String tipo = "Elétrico";

    public MotorEletrico(int potenciaKW) {
        this.potenciaKW = potenciaKW;
    }

    @Override
    public void exibirInfo() {
        String mensagem = String.format("Motor Elétrico criado!\nTipo: %s\nPotência: %d kW", tipo, potenciaKW);
        JOptionPane.showMessageDialog(null, mensagem, "Informações do Motor", JOptionPane.INFORMATION_MESSAGE);
    }
}
