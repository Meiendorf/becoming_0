package contactList.model;

public class Friend extends Contact {
    private String personalPhone;
    private String personalEmail;

    public String getPersonalPhone() { return personalPhone;}
    public void setPersonalPhone(String phone) { this.personalPhone = phone;}

    public String getPersonalEmail() { return personalEmail;}
    public void setPersonalEmail(String email) {this.personalEmail = email;}

    @Override
    public String toString() {
        return "Friend{" +
                "personal phone='" +personalPhone+ '\'' +
                ", personal email='" + personalEmail + '\'' +
                "} " + super.toString();
    }
}
