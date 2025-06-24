public interface AparelhoTelefonico {

    void localizarContato(String nome);
    void ligar(int numero);
    void iniciarCorreioDeVoz(String mensagem);
    void finalizarLigacao();
}
