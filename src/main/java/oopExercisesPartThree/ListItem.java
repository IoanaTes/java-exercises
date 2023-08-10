package oopExercisesPartThree;


public abstract class ListItem {
    protected Object value;
    protected ListItem rightLink;
    protected ListItem leftLink;

    protected ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();

    abstract ListItem setNext();

    abstract ListItem previous();

    abstract ListItem setPrevious();

    abstract ListItem compareTo();

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
