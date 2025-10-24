package prototype;

public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PalioPrototype prototipoPalio = new PalioPrototype(); 

        // 2. Clona para criar o "palioNovo"
        CarroPrototype palioNovo = prototipoPalio.clonar(); 
        palioNovo.setValorCompra(27900.0);
        palioNovo.setEstado("Novo");

        // 3. Clona o protótipo original para criar o "palioUsado"
        CarroPrototype palioUsado = prototipoPalio.clonar();
        palioUsado.setValorCompra(21000.0); 
        palioUsado.setEstado("Usado");

        // 4. Exibe os resultados
        System.out.println(palioNovo.exibirInfo()); 
        System.out.println("--------------------");
        System.out.println(palioUsado.exibirInfo()); 
    }
    
}
