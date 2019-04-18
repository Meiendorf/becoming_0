package contactlist;

import contactlist.controller.ConsoleController;
import contactlist.controller.ContactsController;

public class App {

    public static void main(String[] args) {

        ContactsController controller = new ConsoleController();
        controller.run();
    }

}
