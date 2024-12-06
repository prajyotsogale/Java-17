import java.util.List;

public class Node extends ListItem{
    public Node(Object any) {
        super(any);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        rightLink = item;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(value.equals(item.value)){
            return 0;
        }
        else if(Integer.parseInt(String.valueOf(value))  >
                Integer.parseInt(String.valueOf(item.value))){
            return 1;
        }
        else{
            return -1;
        }
    }


}
