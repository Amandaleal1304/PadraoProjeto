package appmotor;

public class MetAlemao implements Metalurgico {
     @Override
    public Motor criarMotor(int numeroCilindros) {
        if (numeroCilindros == 3 || numeroCilindros == 6) {
            return new MotorAluminio(numeroCilindros);
        } else {
            throw new IllegalArgumentException("Metalúrgico Alemão só produz motores de alumínio com 3 ou 6 cilindros.");
        }
    }
}
