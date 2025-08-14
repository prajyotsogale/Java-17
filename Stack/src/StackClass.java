import java.util.ArrayList;

public class StackClass {

    public static void main(String[] args) {
        Stack1 stack = new Stack1();
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.size);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.size);

        System.out.println(stack.pop());
        System.out.println(stack.size);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

class Stack1{

    ArrayList<Integer> arr = new ArrayList<>();
    int size = 0;
    public boolean isEmpty(){
        return size == 0;
    }
    public void push(int data){
        arr.add(data);
        size++;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr.get(size-1);
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }

        size--;
        return arr.remove(size);
    }
}
