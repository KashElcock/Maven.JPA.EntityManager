import services.ArtistService;

public class App {
    public static void main(String[] args) {
        ArtistService artistService = new ArtistService();
        System.out.println(artistService.findById(1));
    }
}
