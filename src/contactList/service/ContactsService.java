package contactlist.service;

import contactlist.model.Contact;
import contactlist.repository.ContactsRepository;
import contactlist.repository.InMemoryRepo;

import java.util.List;

public class ContactsService {
    private ContactsRepository contactsRepository = new InMemoryRepo();

    public void createContact(Contact contact) {
        contactsRepository.create(contact);
    }

    public List<Contact> getAllContacts() {
        return contactsRepository.readAll();
    }

    public Contact getContactById(int id) {
        return contactsRepository.read(id);
    }

    public void updateContact(Contact contact) {
        contactsRepository.update(contact);
    }

    public void deleteContact(int id) {
        contactsRepository.delete(id);
    }

}
