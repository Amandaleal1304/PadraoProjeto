package adapter;


public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget {
    @Override
    public void carregarImagem(String nomeDoArquivo) {
        
        glCarregarImagem(nomeDoArquivo); 
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        // O método Target com 4 parâmetros chama o método Adaptee com 2 (desconsidera largura e altura)
        glDesenharImagem(posX, posY); 
    }
}
