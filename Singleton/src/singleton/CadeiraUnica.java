package singleton;

public class CadeiraUnica {
    
    private static CadeiraUnica instancia;

  
    private String ocupante;

  
    protected CadeiraUnica() {
        
        this.ocupante = "Vazia";
    }

    
    public static CadeiraUnica Instance() {
        
        if (instancia == null) {
            instancia = new CadeiraUnica(); 
        }
        return instancia; 
    }

    public void reservar(String nome) {
        if (this.ocupante.equals("Vazia")) {
            this.ocupante = nome;
            System.out.println("Cadeira ÚNICA reservada para: " + nome);
        } else {
            System.out.println("A cadeira já está ocupada por: " + this.ocupante);
        }
    }

    public String getOcupante() {
        return this.ocupante;
    }
}
