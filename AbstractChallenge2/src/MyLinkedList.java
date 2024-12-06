

public class MyLinkedList implements NodeList {

    ListItem root;

    public MyLinkedList(ListItem item){
        root = item;
    }

    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem node) {
        //if list is empty
        if(root == null){
            root = node;
            return true;
        }

        ListItem current = root;

        while(true){
            // if there is no next item
            if(current.next() == null){
                current.setNext(node);
                node.setPrevious(current);
                return true;
            }
            //if there is next item but smaller than current
            if( current.compareTo(node) == 1){
                root =  node;
                root.setNext(current);
                current.setPrevious(root);
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean removeItem(ListItem node) {
        if(root==null || node== null){
            return false;
        }
        while(true){
            if(root.compareTo(node)==0){
                root.previous().setNext(null);
                return true;
            }
            root = root.next();
            if(root == null){
                return false;
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        }
        while(root!= null){
            System.out.println(root.getValue());
            root = root.next();
        }
    }
}
