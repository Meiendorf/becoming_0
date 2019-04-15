package contactList;

import contactList.controller.Actions;
import contactList.controller.ConsoleController;
import contactList.controller.ContactsController;

public class App {

    public static void main(String[] args) {

        ContactsController controller = new ConsoleController();
        controller.run();
    }

}
