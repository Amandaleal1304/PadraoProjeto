package appmotor;

public class MetJapones implements Metalurgico{
    @Override
    public Motor criarMotor(int potenciaKW) {
        return new MotorEletrico(potenciaKW);
    }
}
