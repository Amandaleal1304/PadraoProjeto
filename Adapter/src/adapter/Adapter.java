package adapter;

public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImagemTarget imagem;
        
        imagem = new SDLImagemAdapter(); //
        System.out.println("--- Testando SDLImagemAdapter ---");
        // Chama os métodos da interface Target, que o Adapter traduz para a API SDL
        imagem.carregarImagem("teste.png"); //
        imagem.desenharImagem(0, 0, 10, 10); //
        
        System.out.println("\n");
        
        imagem = new OpenGLImageAdapter(); //
        System.out.println("--- Testando OpenGLImageAdapter ---");
        // Chama os métodos da interface Target, que o Adapter traduz para a API OpenGL
        imagem.carregarImagem("teste.png"); //
        imagem.desenharImagem(0, 0, 10, 10); //
    }
    
}
