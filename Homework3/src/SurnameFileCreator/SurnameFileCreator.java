package SurnameFileCreator;

import Contact.Contact;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class SurnameFileCreator {

    public static void CreateSurnameFile(Contact someContact) {
        try (FileWriter fw = new FileWriter(String.format("%s.txt", someContact.getSurname()), true)) {
            fw.append(String.format("%s %s %s %s %s %s\n", someContact.getSurname(), someContact.getName(),
                    someContact.getFname(), someContact.getBirthdate(), someContact.getPhone(), someContact.getSex()));

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
