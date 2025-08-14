
public class LL {
    private int size;
    LL(){
        this.size = 0;
    }
    Node head;
    class Node{
        Node next;
        String data;

        public Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void addAtPosition(int index, String data){


        if(index> size || index <0){
            System.out.println("Invalid Index value");
            return;
        }

        size++;
        if(head == null || index == 0){
            addFirst(data);
            return;
        }
        Node currentNode = head;
        Node newNode = new Node(data);

        for(int i = 0; i < size; i++) {

            if(i == index-1){
                Node nextNode = currentNode.next;
                currentNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currentNode = currentNode.next;
        }

    }
    public void addLast(String data){
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


    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        //more simple is head = head.next

        Node hp1 = head.next;
        head.next = null;
        head = hp1;
        size--;

    }

    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next == null){
             head = null;
             return;
        }

        Node currentNode = head;
        while(currentNode.next.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;

    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
//        LL list = new LL();
//        list.addFirst("this");
//        list.addFirst("is");
//        list.addLast("the");
//        list.addLast("power");
//        list.addLast("of");
//        list.printList();
//        list.deleteFirst();
//        list.printList();
//        list.deleteLast();
//        list.printList();
//        System.out.println(list.getSize());
//        list.addAtPosition(1,"abc");
//        list.printList();


    }
}
