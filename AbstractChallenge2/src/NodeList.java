public interface NodeList {
    Object getRoot();
    boolean addItem(ListItem node);
    boolean removeItem(ListItem node);
    void traverse(ListItem root);
}
