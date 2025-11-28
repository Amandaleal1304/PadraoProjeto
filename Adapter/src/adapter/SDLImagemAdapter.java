package adapter;


public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget {
    @Override
    public void carregarImagem(String nomeDoArquivo) {
        
        SDL_CarregarSurface(nomeDoArquivo); //
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        // O método Target com 4 parâmetros chama o método Adaptee, ajustando a ordem dos parâmetros
        SDL_DesenharSurface(largura, altura, posX, posY); //
    }
}
