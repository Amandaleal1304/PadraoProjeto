package adapter;

public class SDL_Surface {
    // Método para carregar a imagem com a interface original da SDL
    public void SDL_CarregarSurface(String arquivo) {
        System.out.println("Imagem " + arquivo + " carregada."); //
    }
    
    // Método para desenhar a imagem com a interface original da SDL (ordem diferente de parâmetros)
    public void SDL_DesenharSurface(int largura, int altura, int posicaoX, int posicaoY) {
        System.out.println("SDL_Surface desenhada"); //
    }
}
