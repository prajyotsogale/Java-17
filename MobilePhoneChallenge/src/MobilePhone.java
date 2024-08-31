import java.util.*;
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber){
        this.myNumber = phoneNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact)==-1){
            System.out.println(myContacts.contains(contact));
            System.out.println(contact);

            myContacts.add(contact);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        if(myContacts.contains(oldContact)){
            int a = myContacts.indexOf(oldContact);
            myContacts.remove(oldContact);
            myContacts.add(a, newContact);
            return true;
        }else{
            return false;
        }
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }else{
            return false;
        }

    }
    private int findContact(Contact contact){
        if(myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        }return -1;
    }
    private int findContact(String name){
        for(int i=0;i<myContacts.size()-1;i++){
            if(myContacts.get(i).getName() == name){
                return i;
            }
        }return -1;
    }
    public Contact queryContact(String name){
        int a = findContact(name);
        if(a>=0){
            return myContacts.get(a);
        }return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i+1+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber());
        }
    }

//    import java.util.ArrayList;
//
//    public class MobilePhone {
//        private String myNumber;
//        private ArrayList<Contact> myContacts;
//
//        public MobilePhone(String myNumber) {
//            this.myNumber = myNumber;
//            myContacts = new ArrayList();
//        }
//
//        public boolean addNewContact(Contact contact) {
//            if(findContact(contact) == -1) {
//                myContacts.add(contact);
//                return true;
//            }
//            return  false;
//
//        }
//
//        public boolean updateContact(Contact originalContact, Contact updatedContact) {
//            int index = findContact(originalContact);
//            if(index == -1) {
//                return false;
//            }
//            myContacts.set(index, updatedContact);
//            return true;
//        }
//
//        public boolean removeContact(Contact contact) {
//            int index = findContact(contact);
//            if( index == -1) {
//                return false;
//            }
//            myContacts.remove(index);
//            return true;
//        }
//
//        public void printContacts() {
//            System.out.println("Contact List:");
//            for (int i = 0; i < myContacts.size(); i++) {
//                System.out.println(i + 1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
//            }
//        }
//
//        public Contact queryContact(String contactName) {
//            int index = findContact(contactName);
//            if (index == -1) {
//                return  null;
//            }
//            return myContacts.get(index);
//        }
//
//        //Return the index of the found contact
//        private int findContact(Contact contact) {
//            return  findContact(contact.getName());
//        }
//
//        //Return the index of the found contact
//        private int findContact(String contactName) {
//            for (int i = 0; i < myContacts.size(); i++) {
//                if (myContacts.get(i).getName().equals(contactName)) {
//                    return i;
//                }
//            }
//            return -1;
//        }
//
//
//    }
}