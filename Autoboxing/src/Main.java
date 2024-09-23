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

    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.0);
//        return 100.0;
    }
    private static double getDoublePrimitive(){
        return 100.0;
    }
}