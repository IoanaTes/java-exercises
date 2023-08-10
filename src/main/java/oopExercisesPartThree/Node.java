package oopExercisesPartThree;

public class Node extends ListItem {
    protected Node(Object value) {
        super(value);
    }

    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext() {
        return null;
    }

    void setNext(ListItem rightLink) {
        this.rightLink = rightLink;
    }

    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious() {
        return null;
    }

    @Override
    ListItem compareTo() {
        return null;
    }

    void setPrevious(ListItem leftLink) {
        this.leftLink = leftLink;
    }
//    ListItem compareTo(ListItem listItem){
//        if(value.equals(listItem.value))
//    }


}
