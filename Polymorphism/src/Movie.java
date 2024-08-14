public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+" is a "+instanceType+" film");
    }

    public static Movie getMovie(String title, String type){
        return switch (type.toUpperCase().charAt(0)){
            case 'A'-> new Adventure(title);
            case 'C'-> new Comedy(title);
            case 'S'-> new Scifi(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }
    public void sayAdventure(){
        System.out.println("This is a Adventure movie");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"An island","Treasure Map","Pirates");
    }
}
class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    public void sayComedy(){
        System.out.println("This is a Comedy movie");
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"People","laughing","Hungama");
    }
}
class Scifi extends Movie{

    public Scifi(String title) {
        super(title);
    }

    public void sayScifi(){
        System.out.println("This is a scifi movie");
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Alien","Technology","Action");
    }
}