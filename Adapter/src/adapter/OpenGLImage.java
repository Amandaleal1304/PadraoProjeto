
package adapter;

public class OpenGLImage {
    // Método para carregar a imagem com a interface original da OpenGL
    public void glCarregarImagem(String arquivo) {
        System.out.println("Imagem " + arquivo + " carregada."); //
    }
    
    // Método para desenhar a imagem com a interface original da OpenGL (sem largura/altura)
    public void glDesenharImagem(int posicaox, int posicaoY) {
        System.out.println("OpenGL Image desenhada"); //
    }
}
