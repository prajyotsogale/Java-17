public class CycleDetection {
    static Node head;
    static class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void cycleCorrection(Node head){

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                System.out.println("Meeting point "+slow.data);
                removeCycle(slow,head);
                return;
            }
        }
    }

    public static void removeCycle(Node loopNode, Node head){

        Node ptr1 = head;
        Node ptr2 = loopNode;

        while(ptr1 != ptr2){
            System.out.println(ptr1.data +" to "+ ptr1.next.data +" & "+ ptr2.data +" to "+ ptr2.next.data );

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

        }

        Node previous = ptr2;

        while(previous.next != ptr1){
            previous = previous.next;
        }
        previous.next = null;
    }

    public static void printLL(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data +"-->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }


    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = head.next.next.next;
//        printLL();
        cycleCorrection(head);
        printLL();

    }
}
