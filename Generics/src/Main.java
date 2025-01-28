import java.util.ArrayList;

class MyGeneric<T1>{
    int val;
    private T1 t1;

    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add("str1");
//        arrayList.add('s');
        arrayList.add(2);
        arrayList.add(232);

        int a = arrayList.get(0); //run time error if not <integer>


        MyGeneric<String> g1 = new MyGeneric(12,"this is string");
        String str = g1.getT1();
        System.out.println(str);



    }   
}