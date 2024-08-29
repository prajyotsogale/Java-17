import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"first","second","third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0,"one");
        System.out.println("Arraylist = "+originalList);
        System.out.println("array = "+Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(originalArray));

//        originalList.remove(0);
//        originalList.add("forth");

        
    }
}