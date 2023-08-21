package oopExercisesPartThree.abstractionExercise;

import oopExercisesPartThree.abstractionExercise.ListItem;

interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    ListItem traverse();
}
