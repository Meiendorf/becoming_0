package contactList.model;

public abstract class Contact {
    private static int idGen = 0;
    private long id;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public long getId() {return id;}
    public void setId(){
        id = idGen;
        idGen++;
    }

    public String getFirstName(){return firstName;}
    public void setFirstName(String name){firstName = name;}

    public String geLastName(){return lastName;}
    public void setLastName(String name){lastName = name;}

    public String getPhone(){return phone;}
    public void setPhone(String number){phone = number;}

    public String getEmailName(){return email;}
    public void setEmail(String email){this.email = email;}

    @Override
    public String toString() {
        return " Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
