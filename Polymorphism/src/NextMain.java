public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Loki","s");
        movie.watchMovie();

        Scifi loki = (Scifi) Movie.getMovie("Loki","s");
        loki.watchMovie();

        Movie comedy = Movie.getMovie("hungama","c");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.sayComedy();

        var airplane = Movie.getMovie("Airplane","c");
        airplane.watchMovie();

        var plane = new Comedy("Dhamal");
        plane.sayComedy();

        var unknownObject = Movie.getMovie("Dhamaal","S");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.sayComedy();
        }
        else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).sayAdventure();
        }
        else if(unknownObject instanceof  Scifi syfy){
            syfy.sayScifi();
        }
    }
}
