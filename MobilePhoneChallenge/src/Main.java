import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("234234");
        System.out.println(mobilePhone);
        Contact contact1 = new Contact("aaaaa","aaaaa");
        Contact contact2 = new Contact("bbbbb","bbbbb");
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        System.out.println(mobilePhone.addNewContact(contact1));
        mobilePhone.printContacts();


    }



}