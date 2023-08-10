package oopExercisesPartThree;

interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    ListItem traverse();
}
