package buildercarro;

public class FiatBuilder extends CarroBuilder { 
@Override
    public void buildPreco() {
        carro.preco = 25000.00;
    }

    @Override
    public void buildDscMotor() {
        carro.dscMotor = "Fire Flex 1.0";
    }

    @Override
    public void buildAnoDeFabricacao() {
        carro.anoDeFabricacao = 2011;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Palio";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Fiat";
    }
}
