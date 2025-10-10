package appmotor;

public class MetBrasileiro implements Metalurgico {
    @Override
    public Motor criarMotor(int numeroCilindros) {
        if (numeroCilindros == 4 || numeroCilindros == 8) {
            return new MotorAco(numeroCilindros);
        } else {
            throw new IllegalArgumentException("Metalúrgico Brasileiro só produz motores de aço com 4 ou 8 cilindros.");
        }
    }
}
