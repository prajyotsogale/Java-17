import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        //creation
        HashMap<String, Integer> map = new HashMap<>();

        //add Insert
        map.put("India",140);
        map.put("US",30);
        map.put("China",130);
        //update
        map.put("India",130);


        //print
        System.out.println(map);

        //search
        System.out.println(map.containsKey("China"));
        System.out.println(map.containsKey("Australia"));

        System.out.println(map.containsValue(0));

        //get function
        System.out.println(map.get("China"));//exists
        System.out.println(map.get("Australia"));


    }
}
