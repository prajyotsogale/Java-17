import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("indore");
        placesToVisit.add(0,"agra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        removeElements(placesToVisit);
        System.out.println(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Mumbai");
        list.addLast("Kolkata");

        //queue methods
        list.offer("surat");
        list.offerFirst("amravati");
        list.offerLast("chennai");

        //stack methods
        list.push("nagpur");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("surat");

        System.out.println(list);
        String s = list.remove();
        System.out.println(s+" was removed");

        String s1 = list.removeFirst();
        System.out.println(s1+" removed first element");

        String s2 = list.removeLast();
        System.out.println(s2+" removed last element");

        //queue deque poll methods
        String p1 = list.poll();
        System.out.println(p1+" was removed ");
        String p2 = list.pollFirst();
        System.out.println(p2+" first was removed ");
        String p3 = list.pollLast();
        System.out.println(p3+" last was removed ");

        list.push("delhi");
        list.push("mumbai");
        list.push("kolkata");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4+ " was removed");

    }
}