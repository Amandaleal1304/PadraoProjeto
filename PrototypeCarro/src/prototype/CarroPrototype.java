package prototype;

public abstract class CarroPrototype {
    protected double valorCompra;
    protected String estado;

    public abstract String exibirInfo(); 

    public abstract CarroPrototype clonar(); 

    public double getValorCompra() { 
        return valorCompra; 
    } 

    public void setValorCompra(double valorCompra) { 
        this.valorCompra = valorCompra; 
    } 
    
    public void setEstado(String estado) {
        this.estado = estado;
    }


}
