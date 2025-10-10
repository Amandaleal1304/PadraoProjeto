package buildercarro;

public class VolksBuilder extends CarroBuilder {
    @Override
    public void buildPreco() {
        carro.preco = 45000.00;
    }

    @Override
    public void buildDscMotor() {
        carro.dscMotor = "1.6 VHT";
    }

    @Override
    public void buildAnoDeFabricacao() {
        carro.anoDeFabricacao = 2018;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Gol";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Volkswagen";
    }
}
