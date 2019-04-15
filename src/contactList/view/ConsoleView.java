package contactList.view;

import contactList.model.Contact;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {

    private Scanner in = new Scanner(System.in);

    private void printSeparator(){
        System.out.println(new String(new char[30]).replace("\0", "-"));
    }
    public void showWelcome(){
        System.out.println("Welcome to the Contacts app!");
    }

    public void showMainMenu(){
        printSeparator();
        System.out.println("Choose option: ");
        System.out.println("1 - Create contact");
        System.out.println("2 - Read contact");
        System.out.println("3 - Update contact");
        System.out.println("4 - Delete contact");
        System.out.println("5 - Read all contacts");
        System.out.println("6 - Exit");
        return;
    }

    public void reset(){
        in.nextLine();
    }

    public void bye(){
        printSeparator();
        System.out.println("Goodbye!");
    }
    public void showCreateMenu(){
        printSeparator();
        System.out.println("Select type of a contact : ");
        System.out.println("1 - friend");
        System.out.println("2 - colleague");
    }

    public void listContacts(List<Contact> allContacts) {
        printSeparator();
        System.out.println("Listing all contacts: ");
        for (Contact contact : allContacts) {
            System.out.println();
            System.out.println("Contact #" + contact.getId());
            System.out.println(contact.toString());
            System.out.println();
        }
    }
    public void showContact(Contact contact){
        printSeparator();
        System.out.println("Contact id#"+contact.getId());
        System.out.println(contact.toString());
    }
    public int askId(){
        System.out.print("Id : ");
        return in.nextInt();
    }

    public String askFirstName() {
        reset();
        System.out.print("First name: ");
        String name = in.nextLine();
        return name;
    }

    public String askLastName() {
        System.out.print("Last name : ");
        return in.nextLine();
    }

    public String askDepartment() {
        System.out.print("Department : ");
        return in.nextLine();
    }

    public String askCompany() {
        System.out.print("Company : ");
        return in.nextLine();
    }

    public String askEmail() {
        System.out.print("Email : ");
        return in.nextLine();
    }

    public String askPhone() {
        System.out.print("Phone : ");
        return in.nextLine();
    }

    public String askPersonalEmail() {
        System.out.print("Personal email : ");
        return in.nextLine();
    }

    public String askPersonalPhone() {
        System.out.print("Personal phone : ");
        return in.nextLine();
    }


    public int getSelection(){
        System.out.print("Your option : ");
        return in.nextInt();
    }

    public void wrongInput(){
        printSeparator();
        System.out.println("Wrong input!");
    }

    public void notFound(){
        printSeparator();
        System.out.println("Contact wasn't found!");
    }
}
