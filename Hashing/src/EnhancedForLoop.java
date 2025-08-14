import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,3,6,2};

        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();

        LinkedList<Integer> list = new LinkedList<>();
        for(int val: arr){
            list.add(val);
        }
        System.out.println(list);
        for(int val:list){
            System.out.print(val+" ");
        }
        System.out.println();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",140);
        map.put("US",30);
        map.put("China",130);


        //for hashmap

        //entryset
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.print(" : "+e.getValue()+" , ");
//            System.out.print(e+" ,");
        }
        //keyset
        System.out.println();
        System.out.println("-------------------------------".repeat(5));
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.print(key+" : "+map.get(key)+" , ");

        }

        //remove
        System.out.println();
        map.remove("China");
        System.out.println(map);
    }
}
