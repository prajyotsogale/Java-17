import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(70);
        l1.add(71);
        l1.add(0,22);
        l1.add(0,2002);

//        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
//        }


        //Initial capacity
        ArrayList<Integer> l2 = new ArrayList<>(5);
        //l2.add(1);
        l2.addAll(l1);

        for (int i = 0; i < l2.size(); i++) {
            System.out.println(l2.get(i));
        }

    }
}