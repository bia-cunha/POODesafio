public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setArtista("Oasis");
        iphone.setAlbum("Knebworth 1996");
        iphone.setMusica("Don't Look Back in Anger");
        iphone.tocarMusica();

        System.out.println("\nInformações atuais da música");
        System.out.println("Artista: " + iphone.getArtista());
        System.out.println("Album: " + iphone.getAlbum());
        System.out.println("Música: " + iphone.getMusica());

        Iphone iphoneBiah = new Iphone();
        System.out.println("\nStatus da chamada:");
        iphoneBiah.localizarContato("Neto");
        iphoneBiah.ligar(1199999999);

        System.out.println("\nStatus Navegador:" );
        iphoneBiah.digitarSite("www.dio.com.br");
        iphoneBiah.atualizarPagina();
    }
}
