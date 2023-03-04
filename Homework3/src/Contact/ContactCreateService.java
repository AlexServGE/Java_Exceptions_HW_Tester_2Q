package Contact;

import Contact.Birthdate.BirthdateCreateService;
import Contact.Fname.FnameCreateService;
import Contact.Name.NameCreateService;
import Contact.Phone.PhoneCreateService;
import Contact.Sex.SexCreateService;
import Contact.Surname.SurnameCreateService;
import Exceptions.Contact.FormatException;

import java.util.Arrays;
import java.util.Scanner;

public class ContactCreateService {

    public static Contact createContact() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Форматы данных: \n" +
                "фамилия, имя, отчество - строки \n" +
                "дата_рождения - строка формата dd.mm.yyyy \n" +
                "номер_телефона - целое беззнаковое число без форматирования \n" +
                "пол - символ латиницей f или m.");
        System.out.println("Введите через пробел [Фамилия Имя Отчество Датарождения Номертелефона Пол]: ");
        String contactInput = userInput.nextLine();
        String[] contactInputArray = contactInput.split("\\s");

        int triggerRestingUserData = contactInputArray.length;
        boolean triggerSuccessCreation = true;

        if (triggerRestingUserData-- == 0){
            System.out.printf("Вы ввели %d значения. Требуемое количество значений для успешной операции - 6%n",contactInputArray.length);
            return null;
        }
        String surname = contactInputArray[0];
        try {
            surname = SurnameCreateService.checkUserInputSurname(surname);
        } catch (FormatException e) {
            System.out.println(e.getMessage());
            triggerSuccessCreation = false;
        }

        if (triggerRestingUserData-- == 0){
            System.out.printf("Вы ввели %d значения. Требуемое количество значений для успешной операции - 6%n",contactInputArray.length);
            return null;
        }
        String name = contactInputArray[1];
        try {
            name = NameCreateService.checkUserInputName(name);
        } catch (FormatException e) {
            System.out.println(e.getMessage());
            triggerSuccessCreation = false;
        }

        if (triggerRestingUserData-- == 0){
            System.out.printf("Вы ввели %d значения. Требуемое количество значений для успешной операции - 6%n",contactInputArray.length);
            return null;
        }
        String fname = contactInputArray[2];
        try {
            fname = FnameCreateService.checkUserInputFname(fname);
        } catch (FormatException e) {
            System.out.println(e.getMessage());
            triggerSuccessCreation = false;
        }

        if (triggerRestingUserData-- == 0){
            System.out.printf("Вы ввели %d значения. Требуемое количество значений для успешной операции - 6%n",contactInputArray.length);
            return null;
        }
        String birthdate = contactInputArray[3];
        try {
            birthdate = BirthdateCreateService.checkUserInputBirthdate(birthdate);
        } catch (FormatException e) {
            System.out.println(e.getMessage());
            triggerSuccessCreation = false;
        }

        if (triggerRestingUserData-- == 0){
            System.out.printf("Вы ввели %d значения. Требуемое количество значений для успешной операции - 6%n",contactInputArray.length);
            return null;
        }
        String phone = contactInputArray[4];
        try {
            phone = PhoneCreateService.checkUserInputPhone(phone);
        } catch (FormatException e) {
            System.out.println(e.getMessage());
            triggerSuccessCreation = false;
        }

        if (triggerRestingUserData-- == 0){
            System.out.printf("Вы ввели %d значения. Требуемое количество значений для успешной операции - 6%n",contactInputArray.length);
            return null;
        }
        String sex = contactInputArray[5];
        try {
            sex = SexCreateService.checkUserInputSex(sex);
        } catch (FormatException e) {
            System.out.println(e.getMessage());
            triggerSuccessCreation = false;
        }

        if (triggerSuccessCreation) {
            return new Contact(surname, name, fname, birthdate, phone, sex);
        } else {
            return null;
        }
    }

}
