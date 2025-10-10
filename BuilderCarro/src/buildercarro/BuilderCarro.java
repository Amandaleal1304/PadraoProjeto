
package buildercarro;

public class BuilderCarro {
    public static void main(String[] args) {
      // Construindo um carro da Fiat
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
        concessionaria.construirCarro();
        CarroProduct carro = concessionaria.getCarro();
        System.out.println(carro);

        System.out.println(); // Apenas para separar a saída

        // Construindo um carro da Volkswagen
        concessionaria = new ConcessionariaDirector(new VolksBuilder());
        concessionaria.construirCarro();
        carro = concessionaria.getCarro();
        System.out.println(carro);
    
    }
    
}
