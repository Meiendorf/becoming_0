package contactlist.controller;

import contactlist.model.Colleague;
import contactlist.model.Contact;
import contactlist.model.Friend;
import contactlist.service.ContactsService;
import contactlist.view.ConsoleView;
import org.jetbrains.annotations.Nullable;

public class ConsoleController implements ContactsController {

    private ConsoleView view = new ConsoleView();
    private ContactsService contactService = new ContactsService();

    @Override
    public void run(){
        view.showWelcome();

        while(true){
            view.showMainMenu();
            int option = view.getSelection();
            if(option < 1 || option > 6){
                view.wrongInput();
                continue;
            }
            switch (Actions.values()[option-1]){
                case Create:
                    createContact();
                    break;
                case Read:
                    readContact();
                    break;
                case Update:
                    updateContact();
                    break;
                case Delete:
                    deleteContact();
                    break;
                case List:
                    listContacts();
                    break;
                case Exit:
                    view.bye();
                    System.exit(0);
                    break;
            }
        }
    }

    private void createContact(){
        Contact contact = getContactFromView();
        if(contact != null) {
            contactService.createContact(contact);
        }
    }
    private void readContact(){
        Contact contact = contactService.getContactById(view.askId());
        if(contact == null){
            view.notFound();
            return;
        }
        view.showContact(contact);
    }
    private void updateContact(){
        Contact contact = contactService.getContactById(view.askId());
        if(contact == null){
            view.notFound();
            return;
        }
        contact = getContactFromView();
        if(contact != null){
            contactService.updateContact(contact);
        }
    }

    private void deleteContact() {
        contactService.deleteContact(view.askId());
    }

    private void listContacts() {
        view.listContacts(contactService.getAllContacts());
    }

    @Nullable
    private Contact getContactFromView(){
        view.showCreateMenu();
        int option = view.getSelection();
        if(option < 1 || option > 2){
            view.wrongInput();
            return null;
        }
        switch (ContactTypes.values()[option-1]){
            case Colleague:
                Colleague colleague = createColleague();
                return colleague;
            case Friend:
                Friend friend = createFriend();
                return friend;
            default:
                return null;
        }
    }

    private Friend createFriend(){
        Friend friend = new Friend();
        friend.setFirstName(view.askFirstName());
        friend.setLastName(view.askLastName());
        friend.setPhone(view.askPhone());
        friend.setEmail(view.askEmail());
        friend.setPersonalEmail(view.askPersonalEmail());
        friend.setPersonalPhone(view.askPersonalPhone());
        return friend;
    }

    private Colleague createColleague(){
        Colleague colleague = new Colleague();
        colleague.setFirstName(view.askFirstName());
        colleague.setLastName(view.askLastName());
        colleague.setPhone(view.askPhone());
        colleague.setEmail(view.askEmail());
        colleague.setCompany(view.askCompany());
        colleague.setDepartment(view.askDepartment());
        return colleague;
    }
}
