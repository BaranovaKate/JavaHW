package Homework15;
public class Document {
    private String docNumber;
    private String phoneNumber;
    private String email;

    public Document(String docNumber, String phoneNumber, String email){
        this.docNumber = docNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getDocumentNumber() {
        return docNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

}