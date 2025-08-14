public class ReverseLL {
    Node head;
    private int size;
    ReverseLL(){
        this.size = 0;
    }

    class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void add(int data){
        addLast(data);
    }
    public void printLL(){
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
    public int getSize(){
        return size;
    }

    public void reverse(){


        //missed corner cases
        if(head == null || head.next == null){
            return;
        }


        Node previousNode = null;
        Node currentNode = head;
        Node nextNode = head.next;

//        int index =0;
//        int size = getSize();
        while(currentNode !=null){
//            currentNode.next = previousNode;
//
//            previousNode = currentNode;
//            currentNode = nextNode;
//            if(currentNode.next == null){
//                break;
//            }
//            nextNode = currentNode.next;
//            index++;

            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
//        currentNode.next = previousNode;
        head = previousNode;
    }

    public Node recursiveReversal(Node currentNode){
        if(currentNode.next == null){
            head = currentNode;
            return currentNode;
        }
        Node newHead = recursiveReversal(currentNode.next);
        currentNode.next.next = currentNode;
        currentNode.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.printLL();
        list.reverse();
        list.printLL();
        list.recursiveReversal(list.head);
        list.printLL();
    }
}
