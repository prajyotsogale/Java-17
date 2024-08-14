import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        Movie uncharted = Movie.getMovie("uncharted", "Adventure");
//        uncharted.watchMovie();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the type of movie or Q to quit");
            String type = sc.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter the movie title");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(title, type);
            movie.watchMovie();
        }

    }
}

