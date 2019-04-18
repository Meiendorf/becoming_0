package contactlist.repository;

import contactlist.model.Contact;

import java.util.List;

public interface ContactsRepository {
    long create(Contact contact);

    Contact read(long id);

    List<Contact> readAll();

    void update(Contact contact);

    void delete(long id);

    void delete(Contact contact);
}
