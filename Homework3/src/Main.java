import Contact.ContactCreateService;
import Contact.Contact;
import SurnameFileCreator.SurnameFileCreator;

public class Main {
    public static void main(String[] args){
        Contact newContact = ContactCreateService.createContact();
        if (newContact != null){
            SurnameFileCreator.CreateSurnameFile(newContact);
        }
    }
}