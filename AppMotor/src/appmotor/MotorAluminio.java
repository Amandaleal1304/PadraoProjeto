package appmotor;

import javax.swing.JOptionPane;

public class MotorAluminio implements Motor{
    
   // Os atributos agora residem na classe concreta
    private final int numeroCilindros;
    private final String tipo = "Alumínio";

    public MotorAluminio(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    @Override
    public void exibirInfo() {
        String mensagem = String.format("Motor de Alumínio criado!\nTipo: %s\nCilindros: %d", tipo, numeroCilindros);
        JOptionPane.showMessageDialog(null, mensagem, "Informações do Motor", JOptionPane.INFORMATION_MESSAGE);
    }
}
