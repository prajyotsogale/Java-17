import java.util.*;

public class LIstt {
    public static void main(String[] args){
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Bmw");
        l1.add("Volvo");
        l1.add("Audi");
        l1.add("Range Rover");
        l1.add("Mahindra");
        l1.add("Tata");
        l1.add("Toyota");
        l1.add("Suzuki");
        l1.set(0,"Kia");

        l1.remove(2);

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        System.out.println("---------------------------------------------------");
        Collections.sort(l1);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }



    }
}
