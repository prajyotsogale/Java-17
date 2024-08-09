public class Main{
    public static void main(String[] args){
        for (int i = 1; i <=5 ; i++) {
            Student s = new Student("S9230"+i,
                    switch(i){
                        case 1->"Prajyot";
                        case 2 ->"Raj";
                        case 3 ->"Ayush";
                        case 4 ->"Kshitij";
                        default -> "anonymous";
                    },
                    "22/02/2002",
                    "Java and Web development");
            System.out.println(s);
        }

    }
}