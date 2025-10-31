package singleton;

public class TesteCadeira {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--- Teste do Padrão Singleton ---");

        
        System.out.println("Solicitando instância c1...");
        CadeiraUnica c1 = CadeiraUnica.Instance(); 
        System.out.println("C1 está: " + c1.getOcupante());

      
        System.out.println("\nSolicitando instância c2...");
        CadeiraUnica c2 = CadeiraUnica.Instance(); 
        System.out.println("C2 está: " + c2.getOcupante());

        
        System.out.println("\nReservando cadeira usando c1...");
        c1.reservar("Adriana");

    
        System.out.println("Verificando status com c2: " + c2.getOcupante());

        
        if (c1 == c2) {
            
            System.out.println("\nConclusão: c1 e c2 são a mesma instância."); 
        } else {
            System.out.println("\nERRO: c1 e c2 são instâncias diferentes.");
        }

                System.out.println("\nTentando reservar com c2...");
        c2.reservar("Maria");
        System.out.println("Status final (visto por c1): " + c1.getOcupante());
    }
}


