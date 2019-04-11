package contactList.model;

public abstract class Contact {
    private long id;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public long getId() {return id;}
    public void setId(long id){this.id = id;}

    public String getFirstName(){return firstName;}
    public void SetFirstName(String name){firstName = name;}

    public String geLastName(){return lastName;}
    public void SetLastName(String name){lastName = name;}

    public String getPhone(){return phone;}
    public void SetPhone(String number){phone = number;}

    public String getEmailName(){return email;}
    public void SetEmail(String name){this.email = email;}

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
