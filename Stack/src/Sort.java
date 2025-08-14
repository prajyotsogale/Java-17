import java.util.Stack;

public class Sort {

    public static void sort(Stack<Integer> stack){
        if(stack.isEmpty() || stack.size()== 1){
            return;
        }
        int previous = stack.pop();
        sortAStack(stack,previous);
        stack.push(previous);
    }

    private static void sortAStack(Stack<Integer> stack,int previous){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.peek();
        for (int i = 0; i < stack.size(); i++) {
            boolean isChanged = false;
            for (int j = 0; j < stack.size()-1; j++) {
                if(previous<top){
                    top = stack.pop();
                    stack.push(previous);
                    isChanged = true;
                }else{
                    top = stack.pop();
                }
                sortAStack(stack,top);
                stack.push(top);
            }
            if(!isChanged){
                break;
            }
        }
    }

    public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(4);
            stack.push(3);
            stack.push(5);
            stack.push(1);
            stack.push(7);

        System.out.println(stack);
        sort(stack);
        System.out.println(stack);
    }
}
