import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        strList.add(0,"kk");

        strList.add("e");


        //get
        System.out.println(list.get(4));

        System.out.println(list.indexOf(5));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.size());


        //modify

        System.out.println(list.remove(4));

        System.out.println(list.add(1));//adds to last
        list.addFirst(22);
        list.addLast(33);
        System.out.println(list);
        System.out.println(strList);
        //for objects
        strList.remove("c");
        System.out.println(strList);
        strList.removeFirst();
        strList.removeLast();
        System.out.println(strList);
//        String str = "b";
//        ArrayList<String> abc = new ArrayList<>();
//        abc.add("b");
//        abc.add("d");
        strList.add("b");
        strList.addFirst("q");
        strList.addLast("z");
        strList.clear();
        System.out.println(strList);

        System.out.println(list);
        list.clear();

        list.add(5);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(3);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


        ArrayList<String> strings = new ArrayList<>()

        strings.addAll(0,"a");



    }
}