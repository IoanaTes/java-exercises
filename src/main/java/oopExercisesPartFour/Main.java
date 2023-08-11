package oopExercisesPartFour;

public class Main {

    public static void main(String[] args) {
        Contact bob = new Contact("Bob","314159926");
        Contact alice = new Contact("Alice","16180339");

        MobilePhone mobilePhone = new MobilePhone("12345678");
        mobilePhone.addNewContact(bob);
        mobilePhone.addNewContact(alice);
        mobilePhone.findContact("12345678");
        System.out.println(mobilePhone.findContact(bob));

    }
}
