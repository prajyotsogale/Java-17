public class SearchTree implements NodeList{

    private ListItem root;

    public SearchTree(ListItem root){
        this.root = root;
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

    private void performRemoval(ListItem child1, ListItem child2){
        
    }

    @Override
    public void traverse(ListItem root) {

    }
}
