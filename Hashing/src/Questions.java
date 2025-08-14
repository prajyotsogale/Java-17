import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Questions {
    public static void main(String[] args) {

//        int[] arr = {1,2};
//        majorityElement(arr);
//        int[] arr1 = {4, 9, 5, 1, 8};
//        int[] arr2 = {9, 4, 9, 8, 4};
//        System.out.println("\ntotal : "+ intersection(arr1, arr2));
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        itinerary(map);
    }

    public static void majorityElement(int[] arr){
        //create
        HashMap<Integer,Integer> map = new HashMap<>();

        //find frequency
        for (int val : arr) {
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        System.out.println(map);
        int x = arr.length/3;
        Set<Integer> set = map.keySet();
        for (int val : set) {
            if(map.get(val)>x){
                System.out.print(val+" ");
            }
        }
        System.out.println();
    }
    public static int union(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int val: arr1){
            set.add(val);
        }
        for(int val:arr2){
            set.add(val);
        }
        return set.size();
    }
    public static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int val: arr1) {
            set.add(val);
        }
        System.out.print("Unique elements are : ");
        for(int val:arr2){
            if(set.contains(val)){
                //match
                System.out.print(val+" ");
                count++;
                set.remove(val);
            }
        }
        return count;
    }
    public static void itinerary(HashMap<String, String> map){
        Set<String> source = map.keySet();
        String start="";
        for(String val: source){
            if(!map.containsValue(val)){
                start = val;
            }
        }
        while(map.containsKey(start)){

            System.out.print(start+"==> ");
            start = map.get(start);
        }
        System.out.print(start);
    }
}
