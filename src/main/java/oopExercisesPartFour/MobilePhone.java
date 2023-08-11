package oopExercisesPartFour;

import java.util.ArrayList;

public class MobilePhone{
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        for (Contact myContact : myContacts)
            if (myContact.equals(contact))
                return false;
            else
                myContacts.add(contact);
        return true;
    }

    public boolean updateNewContact(Contact contact, Contact newContact) {
        for (int i = 0; i < myContacts.size(); i++)
            if (myContacts.get(i).equals(contact)) {
                myContacts.set(i, newContact);
                return true;
            }
        return false;
    }

    public int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++)
            if (myContacts.get(i).equals(contact))
                return i;
        return -1;
    }
    public int findContact(String s){
        for (int i = 0; i < myContacts.size(); i++)
            if (myContacts.get(i).toString().equals(s))
                return i;
        return -1;
    }
    public Contact queryContact(String s){
        for (int i = 0; i < myContacts.size(); i++)
            if (myContacts.get(i).toString().equals(s))
                return myContacts.get(i);
            return null;
    }
    public void printContacts(){
        for (int i = 0; i < myContacts.size(); i++)
            System.out.println(myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
    }
}
