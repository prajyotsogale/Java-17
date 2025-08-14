
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.peek());
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}

class Node{
    Node next;
    int data;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    public Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int data){
        if(isEmpty()){
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        Node newHead = head.next;
        head.next = null;
        head = newHead;
        return top;
    }

}