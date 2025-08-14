
public class Main {
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    }
}
class createBinaryTree{
    int index = -1;
    public Node createBinaryTree(int[] nodes){
        index++;
        if(nodes[index] == -1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = createBinaryTree(nodes);
        newNode.right = createBinaryTree(nodes);
        return newNode;
    }
}
class Node{
    Node left;
    Node right;
    int data;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}