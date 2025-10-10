package appmotor;

public class MetJapones implements Metalurgico{
    @Override
    public Motor criarMotor(int potenciaKW) {
        // A especificação aqui é a potência do motor.
        return new MotorEletrico(potenciaKW);
    }
}
