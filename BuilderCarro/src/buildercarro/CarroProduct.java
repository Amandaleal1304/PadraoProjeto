package buildercarro;

public class CarroProduct {
    double preco;
    String dscMotor;
    int anoDeFabricacao;
    String modelo;
    String montadora;

    @Override
    public String toString() {
        return "Carro: " + modelo + "/" + montadora +
               "\nAno: " + anoDeFabricacao +
               "\nMotor: " + dscMotor +
               "\nValor: R$ " + String.format("%.2f", preco);
    }
}
