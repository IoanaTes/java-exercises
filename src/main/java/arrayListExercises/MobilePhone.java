package arrayListExercises;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            myContacts.add(contact);
            System.out.println(myContacts.get(findContact(contact)).getName());
            System.out.println(myContacts.get(findContact(contact)).getPhoneNumber());
            return true;
        } else
            return false;
    }

    public boolean updateContact(Contact contact, Contact newContact) {
        if (findContact(contact) != -1) {
            myContacts.set(findContact(contact), newContact);
            return true;
        } else
            return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) != -1) {
            myContacts.remove(findContact(contact));
            return true;
        } else
            return false;
    }


    public int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++)
            if (myContacts.get(i).equals(contact))
                return i;
        return -1;
    }

    public int findContact(String s) {
        for (int i = 0; i < myContacts.size(); i++)
            if (myContacts.get(i).getName().equals(s) || myContacts.get(i).getPhoneNumber().equals(s))
                return i;
        return -1;
    }

    public Contact queryContact(String s) {
        for (int i = 0; i < myContacts.size(); i++)
            if (myContacts.get(i).getName().equals(s))
                return myContacts.get(i);
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++)
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
    }
}
