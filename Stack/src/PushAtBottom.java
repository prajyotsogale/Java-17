import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> stack,int num){
        if(stack.isEmpty()){
            stack.push(num);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack,num);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        pushAtBottom(stack,5);
        System.out.println(stack);
    }
}
