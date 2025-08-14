import java.util.*;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("this");
        list.addFirst("is");
        list.addLast("a");
        list.add("power");
        list.addLast("of");
        list.addLast("a");
        list.addLast("god");
        System.out.println(list);
        System.out.println(list.size());
        list.removeLast();
        list.remove();
        list.removeFirst();
        System.out.println(list);
        list.removeFirst();
        list.addFirst("the");
        list.addFirst("this");
        list.addFirst("is");
        list.addLast("god");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        list.add(2,"the");
        System.out.println(list);
        System.out.println(list.get(6));
        list.addFirst("bro");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
//        list.removeIf();
    }
}
