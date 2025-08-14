public class IntLL {

    Node head;
    private int size;
    public IntLL(){
        this.size = 0;
    }
    class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
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

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is already empty");
            return;
        }
        size--;
        Node nextNode = head.next;
        head.next = null;
        head = nextNode;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is already empty");
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
    public void deleteGreaterThan(int num){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        int index = 0;
        while(currentNode != null){
            if(currentNode.data > num){
                currentNode = currentNode.next;
                removeAtIndex(index);
                continue;
            }
            currentNode = currentNode.next;
            index++;
        }
    }
    public void removeAtIndex(int index){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(index > size-1 || index <0){
            System.out.println("Invalid input");
            return;
        }

        int i = 0;
        Node currentNode = head;
        if(index ==0){
            Node nextNode = currentNode.next;
            currentNode.next= null;
            head = nextNode;
            return;
        }
        while(i<index-1){
            currentNode = currentNode.next;
            i++;
        }
        Node nextNode = currentNode.next.next;
        currentNode.next.next = null;
        currentNode.next = nextNode;
        size--;
    }
    public int indexOf(int data){
        if(head == null){
            return -1;
        }
        Node currentNode = head;
        int index = 0;
        while(currentNode.data != data){
            currentNode = currentNode.next;
            if(currentNode == null){
                return -1;
            }
            index++;
        }
        return index;
    }
    public int lastIndexOf(int data){
        if(head == null){
            return -1;
        }

        Node currentNode = head;
        int index = 0;
        int lastIndex = -1;

        while(currentNode != null){

            if(currentNode.data == data){
                lastIndex = index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return lastIndex;
    }
    public int getSize(){
        return size;
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

    public static void main(String[] args) {
        IntLL list = new IntLL();
        list.add(2);
        list.add(15);
        list.add(39);
        list.add(8);
        list.add(21);
        list.add(46);
        list.add(33);
        list.add(6);
        list.add(17);
        list.add(29);
        list.add(50);
        list.add(11);
        list.add(24);
        list.add(35);
        list.add(1);
        list.add(30);
        list.add(42);
        list.add(9);
        list.add(26);
        list.add(19);
        list.printLL();
        list.deleteGreaterThan(25);
        list.printLL();

    }
}
