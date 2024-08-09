import java.util.LinkedList;
public class LInkedList {
    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        for(int i = 0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        System.out.println("---------------------------------------");
        l1.addFirst(22);
        l1.addLast(2002);

        for(int i= 0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        System.out.println("-------------------------------------------");
        l1.removeFirst();
        l1.removeLast();

        for(int i =0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        System.out.println(l1.getFirst());
    }
}
