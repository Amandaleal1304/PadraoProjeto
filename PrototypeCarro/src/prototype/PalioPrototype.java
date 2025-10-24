package prototype;

public class PalioPrototype extends CarroPrototype{
    
    protected PalioPrototype(PalioPrototype palioPrototype) {
        this.valorCompra = palioPrototype.getValorCompra();
        this.estado = palioPrototype.estado;
    } 
    
    public PalioPrototype() {
        valorCompra = 0.0;
        estado = " ";
    } 
    
    @Override
    public String exibirInfo() { 
        return "Estado: " + this.estado + "\n" + //
               "Modelo: Palio\nMontadora: Fiat\n" + "Valor: R$"
                + getValorCompra();
    } 

    @Override
    public CarroPrototype clonar() { 
        return new PalioPrototype(this);
    }
}
