public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Loki","s");
        movie.watchMovie();

        Scifi loki = (Scifi) Movie.getMovie("Loki","s");
        loki.watchMovie();
    }
}
