import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(22);   //unnecessary boxing
        Integer depreciatedBoxing = new Integer(22);   //depreciated since jdk 9
        int unboxInt = boxedInt.intValue();    //unnecessary

        //Automatic
        Integer autoBoxed = 15;
        int unBoxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(unBoxed.getClass().getName());

        Double resultBoxed = getDoublePrimitive();
        double resultUnboxed = getDoubleObject();
        System.out.println(resultBoxed.getClass().getName());


        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 22;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray.getClass().getName());

        Character[] characterArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(characterArray));

        var myList = getList(1,2,3,4,5,6);
        System.out.println(myList);

    }

    private static int getInt(Integer i){
        return i;
    }
    private static Integer getInteger(int i){
        return i;
    }

    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: varargs){
            list.add(i);
        }
        return list;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.0);
//        return 100.0;
    }
    private static double getDoublePrimitive(){
        return 100.0;
    }
}