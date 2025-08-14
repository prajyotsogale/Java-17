import java.util.HashSet;
import java.util.Iterator;


public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        //search
        if(set.contains(1)){
            System.out.println("one");
        }
        if(!set.contains(6)){
            System.out.println("not six");
        }
        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("one removed");
        }
        set.remove(6);
        if(set.contains(6)){
            System.out.println("six is there");
        }else{
            System.out.println("six not there");
        }

        //size
        set.add(1);
        set.add(6);
        set.add(4);
        set.add(5);
        System.out.println("size of set is: "+set.size());

        //print
        System.out.println(set);

        //iterator
        Iterator it = set.iterator();
//        System.out.printf(it.next()+"\n");
//        System.out.printf(it.next()+"\n");
//        System.out.printf(it.next()+"\n");
//        System.out.printf(it.next()+"\n");
//        System.out.printf(it.next()+"\n");
//        System.out.printf(it.next()+"\n");
//        System.out.printf(it.next()+"\n");
        while(it.hasNext()){
            System.out.printf(it.next()+" ");
        }
    }
}
