package Contact.Surname;

import Exceptions.Contact.FormatException;

import java.text.Format;
import java.util.Scanner;

public class SurnameCreateService {
    public static String checkUserInputSurname(String userInput) throws FormatException {
        String msgTotal = "";
        if (!isUserInputCapitalLetter(userInput)) {
            msgTotal += "Фамилия: Отсутствует заглавная буква.\n";
        }
        if (!isUserInputLettersOnly(userInput)) {
            msgTotal += "Фамилия: Допустимыми символами являются только буквы.\n";
        }
        if (!isUserInputTenLetters(userInput)) {
            msgTotal += "Фамилия: Допустимый размер данных равен не менее 2 символов и не более 10 символам.\n";
        }
        if (!msgTotal.isEmpty()){
            throw new FormatException(msgTotal);
        } else {
            return userInput;
        }
    }
    public static boolean isUserInputCapitalLetter(String userInput) {
        return userInput.matches("[А-ЯЁ].+");
    }

    public static boolean isUserInputLettersOnly(String userInput) {
        return userInput.matches("[А-ЯЁа-яё]+");
    }

    public static boolean isUserInputTenLetters(String userInput) {
        return userInput.matches(".{2,10}");
    }

}
