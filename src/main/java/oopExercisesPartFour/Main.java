package oopExercisesPartFour;

public class Main {

    public static void main(String[] args) {
        Contact ioana = new Contact("ioana","314159926");
        Contact alice = new Contact("Alice","16180339");
        Contact diana = new Contact("diana","456789");

        MobilePhone mobilePhone = new MobilePhone("12345678");
        System.out.println(mobilePhone.addNewContact(ioana));
        System.out.println(mobilePhone.addNewContact(Contact.createContact("Bob","23456789")));
        System.out.println(mobilePhone.addNewContact(alice));
        System.out.println(mobilePhone.addNewContact(alice));
        System.out.println(mobilePhone.updateContact(diana,ioana));
        System.out.println(mobilePhone.removeContact(alice));
        System.out.println(mobilePhone.findContact("16180339"));
        System.out.println(mobilePhone.findContact(ioana));
        System.out.println(mobilePhone.findContact("Bob"));
        System.out.println(mobilePhone.queryContact("Bob").getName());
        mobilePhone.printContacts();


    }
}
