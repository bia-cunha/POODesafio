 public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    String artista;
    String album;
    String musica;

     @Override
     public void selecionarMusica() {
         System.out.println("Selecione a música:");
     }

    @Override
    public void tocarMusica() {
        System.out.println("Iniciando a música: " + musica + " - " + "Artista: " +  artista + " - " + "Álbum: " + album);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando a música");
    }

     @Override
     public void localizarContato(String nome) {
         System.out.println("Digite o nome do contato: " + nome);
     }

     @Override
     public void ligar(int numero) {
         System.out.println("Discando: " + numero);
     }

     @Override
     public void iniciarCorreioDeVoz(String mensagem) {
         System.out.println("Deixe sua mensagem após o sinal: " + mensagem);
     }


     @Override
     public void finalizarLigacao() {
         System.out.println("Ligação finalizada.");
     }

     @Override
     public void iniciarNavegador() {
         System.out.println("Iniciando o navegador");
     }

     @Override
     public void digitarSite(String url) {
         System.out.println("Digite o site que deseja acessar: " + url);
     }

     @Override
     public void atualizarPagina() {
         System.out.println("Atualizando a página");
     }

     @Override
     public void adicionarNovaAba() {
         System.out.println("+ Nova guia");
     }

     public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
}
